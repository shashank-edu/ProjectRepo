package com.springboot.product.Entities;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;


@Entity
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 3)
    private int quantity;


    @Column(nullable = false, unique = true, length = 45)
    private String name;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private String category;
    @Column(nullable = false)
    private int price;

    public Product(Integer id, int quantity, String name, String type, String category, int price) {
        this.id = id;
        this.quantity = quantity;
        this.name = name;
        this.type = type;
        this.category = category;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice (int price) {
        this.price = price;
    }
    public Product() {
    }

    public int getQuantity() {
        return quantity;
    }
   
    public void setQuantity(int quantity) {
        quantity = quantity;
    }

}
