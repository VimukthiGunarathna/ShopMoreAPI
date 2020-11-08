package com.shopmore.service;

import com.shopmore.model.Carton;
import com.shopmore.model.Product;

import java.util.List;

public interface ProductService {
    public List<Product> getAllProducts();
    public List<Carton> getAllCartonPrices();
}
