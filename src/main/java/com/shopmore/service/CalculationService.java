package com.shopmore.service;

public class CalculationService {

    public static Double getSingleUnitPrice(Integer cartonPrice) {
        return (cartonPrice*30)/100.0;
    }
    public static Double getMultipleUnitPrice(Integer qty,Integer cartonPrice,Integer unitsPerCarton){
        double total;
        if((qty/unitsPerCarton>=3)){
           int discount = (cartonPrice*10)/100;
           int cartons = qty/unitsPerCarton;
           int units = qty%unitsPerCarton;
           total = (cartons*cartonPrice)+(units*(getSingleUnitPrice(cartonPrice)))-discount;
        }else{
            int cartons = qty/unitsPerCarton;
            int units = qty%unitsPerCarton;
            total = (cartons*cartonPrice)+(units*(getSingleUnitPrice(cartonPrice)));
        }
        return total;
    }
}
