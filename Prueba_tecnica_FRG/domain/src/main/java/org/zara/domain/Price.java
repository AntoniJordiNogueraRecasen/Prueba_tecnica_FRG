package org.zara.domain;

import java.time.LocalDateTime;
import java.util.Date;

public class Price {
    private int brand_id;
    private LocalDateTime start_date;
    private LocalDateTime end_date;
    private int price_list;
    private String product_id;
    private int priority;
    private double price;
    private String curr;

    public Price(){}

    public Price(PriceBuilder priceBuilder){
        brand_id = priceBuilder.brand_id;
        start_date = priceBuilder.start_date;
        end_date = priceBuilder.end_date;
        price_list = priceBuilder.price_list;
        product_id = priceBuilder.product_id;
        priority = priceBuilder.priority;
        price = priceBuilder.price;
        curr = priceBuilder.curr;
    }

    public int getBrand_id() {
        return brand_id;
    }

    public LocalDateTime getStart_date() {
        return start_date;
    }

    public LocalDateTime getEnd_date() {
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

    public void setStart_date(LocalDateTime start_date) {
        this.start_date = start_date;
    }

    public void setEnd_date(LocalDateTime end_date) {
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


    @Override
    public String toString() {
        return "Price{" +
                "brand_id=" + brand_id +
                ", start_date=" + start_date +
                ", end_date=" + end_date +
                ", price_list=" + price_list +
                ", product_id='" + product_id + '\'' +
                ", priority=" + priority +
                ", price=" + price +
                ", curr='" + curr + '\'' +
                '}';
    }

    public static class PriceBuilder {
        private int brand_id;
        private LocalDateTime start_date;
        private LocalDateTime end_date;
        private int price_list;
        private String product_id;
        private int priority;
        private double price;
        private String curr;

        public PriceBuilder brand_id(int brand_id) {
            this.brand_id = brand_id;
            return this;
        }

        public PriceBuilder start_date(LocalDateTime start_date) {
            this.start_date = start_date;
            return this;
        }

        public PriceBuilder end_date(LocalDateTime end_date) {
            this.end_date = end_date;
            return this;
        }

        public PriceBuilder price_list(int price_list) {
            this.price_list = price_list;
            return this;
        }

        public PriceBuilder product_id(String product_id) {
            this.product_id = product_id;
            return this;
        }

        public PriceBuilder priority(int priority) {
            this.priority = priority;
            return this;
        }

        public PriceBuilder price(double price) {
            this.price = price;
            return this;
        }

        public PriceBuilder curr(String curr) {
            this.curr = curr;
            return this;
        }
    }
}
