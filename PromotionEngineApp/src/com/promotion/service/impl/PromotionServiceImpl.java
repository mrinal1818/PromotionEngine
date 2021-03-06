package com.promotion.service.impl;

import java.util.List;

import com.promotion.model.Product;
import com.promotion.service.PromotionService;

public class PromotionServiceImpl implements PromotionService{

	@Override
	public int getTotalPrice(List<Product> products) {
		int counterA = 0;
	    int priceA = 50;
	    int counterB = 0;
	    int priceB = 30;
	    int counterC = 0;
	    int priceC = 20;
	    int counterD = 0;
	    int priceD = 15;
	    
	    int totalPrice = 0;
	    boolean promotionApplied = false;

	    for(Product product : products)
	    {
	        switch (product.getProductType())
	        {
	            case "A":
	            case "a":
	            	counterA += 1;
	                break;
	            case "B":
	            case "b":
	                counterB += 1;
	                break;
	            case "C":
	            case "c":
	                counterC += 1;
	                break;
	            case "D":
	            case "d":
	                counterD += 1;
	                break;
	        }
	    }
	    
	    if(counterA == 3) {
	    	
	    	int totalPriceA = (counterA / 3) * 130 + (counterA % 3 * priceA);
	 	    int totalPriceB = (counterB * priceB);
	 	    int totalPriceC = (counterC * priceC);
	 	    int totalPriceD = (counterD * priceD);
	 	    totalPrice = totalPriceA + totalPriceB + totalPriceC + totalPriceD;
	 	    promotionApplied = true;
	    }else if((counterB == 2) && !promotionApplied) {
	    	int totalPriceA = (counterA * priceA);
		    int totalPriceB = (counterB / 2) * 45 + (counterB % 2 * priceB);
		    int totalPriceC = (counterC * priceC);
		    int totalPriceD = (counterD * priceD);
		    totalPrice = totalPriceA + totalPriceB + totalPriceC + totalPriceD;
		    promotionApplied = true;
	    }else if(counterC==1 && counterD==1 && !promotionApplied) {
	    	int totalPriceA = (counterA * priceA);
		    int totalPriceB = (counterB * priceB);
	    	int totalPriceC = (counterC * priceC);
		    int totalPriceD = (counterD * priceD);
		    totalPrice = totalPriceA + totalPriceB + ((totalPriceC+totalPriceD) - 5);
		    promotionApplied = true;
	    }else {
	    	int totalPriceA = (counterA * priceA);
		    int totalPriceB = (counterB * priceB);
		    int totalPriceC = (counterC * priceC);
		    int totalPriceD = (counterD * priceD);
		    totalPrice = totalPriceA + totalPriceB + totalPriceC + totalPriceD;
	    }
	  
	    return totalPrice;
	}

}
