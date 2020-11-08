package com.shopmore.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer prod_id;
    private Integer carton_id;
    private String prod_name;
    private String prod_desc;

    public Product(Integer prod_id, Integer carton_id, String prod_name, String prod_desc) {
        this.prod_id = prod_id;
        this.carton_id = carton_id;
        this.prod_name = prod_name;
        this.prod_desc = prod_desc;
    }

    public Product(Integer carton_id, String prod_name, String prod_desc) {
        this.carton_id = carton_id;
        this.prod_name = prod_name;
        this.prod_desc = prod_desc;
    }

    public Product() {
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

    public String getProd_desc() {
        return prod_desc;
    }

    public void setProd_desc(String prod_desc) {
        this.prod_desc = prod_desc;
    }
}
