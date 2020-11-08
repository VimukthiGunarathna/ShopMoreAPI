package com.shopmore.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Carton {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer carton_id;
    private Integer carton_price;
    private Integer prod_id;
    private Integer units;

    public Carton() {
    }

    public Carton(Integer carton_id, Integer carton_price, Integer prod_id, Integer units) {
        this.carton_id = carton_id;
        this.carton_price = carton_price;
        this.prod_id = prod_id;
        this.units = units;
    }

    public Carton(Integer carton_price, Integer prod_id, Integer units) {
        this.carton_price = carton_price;
        this.prod_id = prod_id;
        this.units = units;
    }

    public Integer getCarton_id() {
        return carton_id;
    }

    public void setCarton_id(Integer carton_id) {
        this.carton_id = carton_id;
    }

    public Integer getCarton_price() {
        return carton_price;
    }

    public void setCarton_price(Integer carton_price) {
        this.carton_price = carton_price;
    }

    public Integer getProd_id() {
        return prod_id;
    }

    public void setProd_id(Integer prod_id) {
        this.prod_id = prod_id;
    }

    public Integer getUnits() {
        return units;
    }

    public void setUnits(Integer units) {
        this.units = units;
    }
}
