package com.travelport.projecttwo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "products")
public class ProductEntity {

    @Id
    private String id;

    private String name;

    private String code;

    private int stock;

    public ProductEntity(String id, String name, String code, int stock) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.stock = stock;
    }

    public ProductEntity() {
        this.id = UUID.randomUUID().toString();
        this.stock = 0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
