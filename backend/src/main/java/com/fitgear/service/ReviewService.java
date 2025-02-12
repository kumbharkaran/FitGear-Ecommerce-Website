package com.fitgear.service;

import java.util.List;

import com.fitgear.entities.Review;
import com.fitgear.entities.User;
import com.fitgear.exception.ProductException;
import com.fitgear.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
