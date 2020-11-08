package com.shopmore.service;

import com.shopmore.model.Product;
import com.shopmore.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repository;

    @Override
    public List<Product> getProducts() {
        return null;
    }
}
