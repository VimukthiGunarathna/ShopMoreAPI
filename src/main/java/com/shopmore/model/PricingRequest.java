package com.shopmore.model;

/**
 * REQUEST TYPE
 */
public class PricingRequest {
    private Integer prod_id;
    private Integer qty_cartons;
    private Integer qty_units;

    public PricingRequest(Integer prod_id, Integer qty_cartons, Integer qty_units) {
        this.prod_id = prod_id;
        this.qty_cartons = qty_cartons;
        this.qty_units = qty_units;
    }

    public Integer getProd_id() {
        return prod_id;
    }

    public void setProd_id(Integer prod_id) {
        this.prod_id = prod_id;
    }

    public Integer getQty_cartons() {
        return qty_cartons;
    }

    public void setQty_cartons(Integer qty_cartons) {
        this.qty_cartons = qty_cartons;
    }

    public Integer getQty_units() {
        return qty_units;
    }

    public void setQty_units(Integer qty_units) {
        this.qty_units = qty_units;
    }
}
