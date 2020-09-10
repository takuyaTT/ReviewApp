package com.reviewapp.controller;

import com.reviewapp.repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ReviewController {

    @Autowired
    ReviewRepository repository;

}
