package com.basaveshinfo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.basaveshinfo.model.UserReviewData;

@RestController
@RequestMapping("/userreview")
public class UserReviewResource {

	@RequestMapping("/{userId}")
	public UserReviewData userReviewData(@PathVariable("userId") String userId) {
		
		System.out.println("user review service invoked");
		return new UserReviewData(userId, "Basavesh", "Wolf of wall street", "Incredible Movie");
	}
}