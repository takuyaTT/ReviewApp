package com.reviewapp.service;

import com.reviewapp.data.Review;
import com.reviewapp.repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository repository;

    // indexにリターンする
    public ModelAndView returnIndex(ModelAndView mav){
        mav.setViewName("test");
        List<Review> reviewList = repository.findAll();
        mav.addObject("reviewList",reviewList);
        return mav;
    }
}
