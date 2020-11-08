package com.shopmore.service;

import com.shopmore.model.AllPricingRequest;
import com.shopmore.model.Carton;
import com.shopmore.model.Product;
import com.shopmore.repository.CartonRepository;
import com.shopmore.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CartonRepository cartonRepository;

    private CalculationService calculator;

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

    @Override
    public List<AllPricingRequest> getAllPricing() {
        List<Product> allProducts = getAllProducts();
        List<AllPricingRequest> response = new ArrayList<>();
        allProducts.forEach(x ->{
            Carton carton = cartonRepository.findById(x.getCarton_id()).get();
            AllPricingRequest item = new AllPricingRequest(
                    x.getProd_id(),
                    carton.getCarton_id(),
                    x.getProd_name(),
                    carton.getUnits(),
                    carton.getCarton_price(),
                    CalculationService.getSingleUnitPrice(carton.getCarton_price()),
                    CalculationService.getMultipleUnitPrice(25,carton.getCarton_price(),carton.getUnits()),
                    CalculationService.getMultipleUnitPrice(50,carton.getCarton_price(),carton.getUnits())
            );
            response.add(item);
        });
        return response;
    }


}
