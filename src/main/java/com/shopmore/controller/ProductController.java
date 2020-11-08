package com.shopmore.controller;

import com.shopmore.model.Carton;
import com.shopmore.model.Product;
import com.shopmore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/getAllProducts")
    public List<Product> getProduct() {
        return productService.getAllProducts();
    }

    @GetMapping("/getAllCartonPrice")
    public List<Carton>getAllCartonPrice(){
        return productService.getAllCartonPrices();
    }
}
