package com.promotion.service;

import java.util.List;

import com.promotion.model.Product;

public interface PromotionService {

    int getTotalPrice(List<Product> products);
}
