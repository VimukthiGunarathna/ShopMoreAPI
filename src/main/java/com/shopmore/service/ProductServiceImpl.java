package com.shopmore.service;

import com.shopmore.model.Carton;
import com.shopmore.model.Product;
import com.shopmore.repository.CartonRepository;
import com.shopmore.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CartonRepository cartonRepository;

    @Override
    public List<Product> getAllProducts() {
        return StreamSupport
                .stream(productRepository.findAll().spliterator(),false)
                .collect(Collectors.toList());
    }

    @Override
    public List<Carton> getAllCartonPrices() {
        return StreamSupport
                .stream(cartonRepository.findAll().spliterator(),false)
                .collect(Collectors.toList());
    }
}
