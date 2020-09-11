package com.promotion.app;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.promotion.model.Product;
import com.promotion.service.PromotionService;
import com.promotion.service.impl.PromotionServiceImpl;

public class PromotionApp {

	public static void main(String args[]) {
		
		PromotionService promotionService = new PromotionServiceImpl();
	
		List<Product> productList = new ArrayList<Product>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter total number of order : ");
        int orderCount = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < orderCount; i++)
        { 
        	System.out.print("Please enter type of product[A,B,C,D] : ");
        	String productType = scanner.nextLine();
        	Product product = new Product();
        	product.setProductType(productType);
        	productList.add(product);
        }
        
        int totalPrice = promotionService.getTotalPrice(productList);
        System.out.println("Total Price of the product : "+totalPrice); 
        
        scanner.close();
	}
	
}
