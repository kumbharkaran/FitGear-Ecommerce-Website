package com.fitgear.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fitgear.entities.Product;
import com.fitgear.exception.ProductException;
import com.fitgear.service.ProductService;


@RestController
@RequestMapping("/api")
public class UserProductController {
	
	private ProductService productService;
	
	public UserProductController(ProductService productService) {
		this.productService=productService;
	}
	
	
	@GetMapping("/products")
	public ResponseEntity<Page<Product>> findProductByCategoryHandler(
	        @RequestParam(required = false) String category,  
	        @RequestParam(required = false) List<String> color,  
	        @RequestParam(required = false) List<String> size,  
	        @RequestParam(required = false) Integer minPrice,  
	        @RequestParam(required = false) Integer maxPrice,  
	        @RequestParam(required = false) Integer minDiscount,  
	        @RequestParam(required = false) String sort,  
	        @RequestParam(required = false) String stock,  
	        @RequestParam(defaultValue = "0") Integer pageNumber,  // ✅ Default value 0
	        @RequestParam(defaultValue = "10") Integer pageSize) {  // ✅ Default value 10

		if (color == null) color = Collections.emptyList();
	    if (size == null) size = Collections.emptyList();
	    // Logging for debugging
	    System.out.println("Category: " + category);
	    System.out.println("Colors: " + color);
	    System.out.println("Sizes: " + size);
	    System.out.println("Min Price: " + minPrice);
	    System.out.println("Max Price: " + maxPrice);
	    System.out.println("Min Discount: " + minDiscount);
	    System.out.println("Sort: " + sort);
	    System.out.println("Stock: " + stock);
	    System.out.println("Page Number: " + pageNumber);
	    System.out.println("Page Size: " + pageSize);

	    // Call service layer
	    Page<Product> res = productService.getAllProduct(category, color, size, minPrice, maxPrice, minDiscount, sort, stock, pageNumber, pageSize);

	    return new ResponseEntity<>(res, HttpStatus.ACCEPTED);
	}

	

	
	@GetMapping("/products/id/{productId}")
	public ResponseEntity<Product> findProductByIdHandler(@PathVariable Long productId) throws ProductException{
		
		Product product=productService.findProductById(productId);
		
		return new ResponseEntity<Product>(product,HttpStatus.ACCEPTED);
	}

	@GetMapping("/products/search")
	public ResponseEntity<List<Product>> searchProductHandler(@RequestParam String q){
		
		List<Product> products=productService.searchProduct(q);
		
		return new ResponseEntity<List<Product>>(products,HttpStatus.OK);
		
	}
}
