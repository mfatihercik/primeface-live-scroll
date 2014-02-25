/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mfatihercik.pflivescroll.model;

/**
 *
 * @author mfe
 */
public class Product {
    private Integer id;
    private String name;
    private String image;

    public Product(Integer id, String name, String image) {
        this.id = id;
        this.name = name;
        this.image = image;
    }
    
    public Product(){
        
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    
    
}
