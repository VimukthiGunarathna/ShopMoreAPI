package com.shopmore.service;

import com.shopmore.model.AllPricingRequest;
import com.shopmore.model.Carton;
import com.shopmore.model.PricingRequest;
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
    private ProductRepository productRepository; // product table cruds
    @Autowired
    private CartonRepository cartonRepository; // cartons table cruds


    /**
     * Returns every product which is in the system
     * @return : product list
     */
    @Override
    public List<Product> getAllProducts() {
        return StreamSupport
                .stream(productRepository.findAll().spliterator(),false)
                .collect(Collectors.toList());
    }

    /**
     * Returns every cartons price
     * @return : carton price list
     */
    @Override
    public List<Carton> getAllCartonPrices() {
        return StreamSupport
                .stream(cartonRepository.findAll().spliterator(),false)
                .collect(Collectors.toList());
    }

    /**
     * Returns every products pricing with considering
     * different amounts of units and discounts
     * @return : price list
     */
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

    /**
     * Returns the total of the request products
     * according to the quantity (unit and cartons)
     * @return total
     */
    @Override
    public Double getPricing(PricingRequest pricingRequest) {
        Carton carton = getCarton(pricingRequest.getProd_id());
         double total = CalculationService.getMultipleUnitPrice(
                 (pricingRequest.getQty_cartons()*carton.getUnits()+pricingRequest.getQty_units()),
                 carton.getCarton_price(),
                 carton.getUnits());
        return total;
    }

    // Helper Methods
    private Carton getCarton(Integer prodId){
        return cartonRepository.findById(prodId).get();
    }
}
