package com.fitgear.service;

import com.fitgear.entities.Cart;
import com.fitgear.entities.CartItem;
import com.fitgear.entities.User;
import com.fitgear.exception.ProductException;
import com.fitgear.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public CartItem addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
