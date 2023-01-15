package org.zara.application.dto;

import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class PriceDTO {
    private int brand_id;
    private Date start_date;
    private Date end_date;
    private int price_list;
    private String product_id;
    private int priority;
    private double price;
    private String curr;

    public PriceDTO(){}


    public int getBrand_id() {
        return brand_id;
    }

    public Date getStart_date() {
        return start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public int getPrice_list() {
        return price_list;
    }

    public String getProduct_id() {
        return product_id;
    }

    public int getPriority() {
        return priority;
    }

    public double getPrice() {
        return price;
    }

    public String getCurr() {
        return curr;
    }


    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public void setPrice_list(int price_list) {
        this.price_list = price_list;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCurr(String curr) {
        this.curr = curr;
    }
}
