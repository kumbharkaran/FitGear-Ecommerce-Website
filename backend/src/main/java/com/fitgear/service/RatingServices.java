package com.fitgear.service;

import java.util.List;

import com.fitgear.entities.Rating;
import com.fitgear.entities.User;
import com.fitgear.exception.ProductException;
import com.fitgear.request.RatingRequest;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
