package com.DesignPattern.Builder.Sandwich.v1;

import lombok.Getter;

@Getter
public class SubwaySandwich {
    private String bread;
    private String condiments;
    private String veggies;
    private String fillings;
    
    public SubwaySandwich(Builder b){
        this.bread = b.bread;
        this.condiments = b.condiments;
        this.veggies = b.veggies;
        this.fillings = b.fillings;
    }
    
}
