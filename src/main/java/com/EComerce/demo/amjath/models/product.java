package com.EComerce.demo.amjath.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class product {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;
    private String description;
    private double rating;
    private String categories;
    private String seller;
    private int stock;
    private int numOfReview;

    public product(String name, double price, String description, double rating, String categories, String seller, int stock, int numOfReview) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.rating = rating;
        this.categories = categories;
        this.seller = seller;
        this.stock = stock;
        this.numOfReview = numOfReview;
    }

    public product(){
        super();
    }



}
