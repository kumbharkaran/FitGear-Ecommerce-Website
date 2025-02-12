package com.fitgear.service;

import com.fitgear.entities.Cart;
import com.fitgear.entities.CartItem;
import com.fitgear.entities.Product;
import com.fitgear.exception.CartItemException;
import com.fitgear.exception.UserException;

public interface CartItemService {
	
	public CartItem createCartItem(CartItem cartItem);
	
	public CartItem updateCartItem(Long userId, Long id,CartItem cartItem) throws CartItemException, UserException;
	
	public CartItem isCartItemExist(Cart cart,Product product,String size, Long userId);
	
	public void removeCartItem(Long userId,Long cartItemId) throws CartItemException, UserException;
	
	public CartItem findCartItemById(Long cartItemId) throws CartItemException;
	
}
