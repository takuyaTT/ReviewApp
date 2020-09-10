package com.reviewapp.controller;

import com.reviewapp.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    /*
        Review / User 関連以外の処理を担当
     */
    @Autowired
    private ReviewService service;

    // TOPページ移動
    @GetMapping("/")
    public ModelAndView rootIndex(ModelAndView mav){
        return service.returnIndex(mav);
    }

    // 各ページへ移動
    @GetMapping("/{pathName}")
    public ModelAndView index(ModelAndView mav, @PathVariable("pathName")String pathName){
        mav.setViewName(pathName);
        return mav;
    }

}
