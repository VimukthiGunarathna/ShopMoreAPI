package com.shopmore.service;

import com.shopmore.model.Product;
import com.shopmore.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repository;

    @Override
    public List<Product> getAllProducts() {
        return StreamSupport
                .stream(repository.findAll().spliterator(),false)
                .collect(Collectors.toList());
    }
}
