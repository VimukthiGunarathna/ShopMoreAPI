package com.shopmore.model;

/**
 * REQUEST TYPE
 */
public class AllPricingRequest {

    private Integer prod_id;
    private Integer carton_id;
    private String prod_name;
    private Integer units;
    private Integer carton_price;
    private Double unit_price;
    private Double units_25;
    private Double units_50;

    public AllPricingRequest(Integer prod_id, Integer carton_id, String prod_name, Integer units, Integer carton_price, Double unit_price, Double units_25, Double units_50) {
        this.prod_id = prod_id;
        this.carton_id = carton_id;
        this.prod_name = prod_name;
        this.units = units;
        this.carton_price = carton_price;
        this.unit_price = unit_price;
        this.units_25 = units_25;
        this.units_50 = units_50;
    }

    public Integer getUnits() {
        return units;
    }

    public void setUnits(Integer units) {
        this.units = units;
    }

    public Integer getProd_id() {
        return prod_id;
    }

    public void setProd_id(Integer prod_id) {
        this.prod_id = prod_id;
    }

    public Integer getCarton_id() {
        return carton_id;
    }

    public void setCarton_id(Integer carton_id) {
        this.carton_id = carton_id;
    }

    public String getProd_name() {
        return prod_name;
    }

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }

    public Integer getCarton_price() {
        return carton_price;
    }

    public void setCarton_price(Integer carton_price) {
        this.carton_price = carton_price;
    }

    public Double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(Double unit_price) {
        this.unit_price = unit_price;
    }

    public Double getUnits_25() {
        return units_25;
    }

    public void setUnits_25(Double units_25) {
        this.units_25 = units_25;
    }

    public Double getUnits_50() {
        return units_50;
    }

    public void setUnits_50(Double units_50) {
        this.units_50 = units_50;
    }
}
