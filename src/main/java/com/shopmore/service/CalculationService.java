package com.shopmore.service;

/**
 * This service is written purely for all the
 * calculation features and calculation optimizations
 */
public class CalculationService {

    /**
     * Calculates the unit price of an carton
     * @param cartonPrice : price of a carton
     * @return unit price(double)
     */
    public static Double getSingleUnitPrice(Integer cartonPrice) {
        return (cartonPrice*30)/100.0;
    }

    /**
     * Handles multiple quantity according to the,
     * carton price, discount rates, unit price
     * and calculates the total of the request
     *
     * @param qty : total quantity (In units)
     * @param cartonPrice : price of an carton
     * @param unitsPerCarton : units per carton
     * @return total of the request
     */
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
