package com.DesignPattern.Builder.Sandwich.v2;

import lombok.Getter;

@Getter
public class SubwaySandwich {
    private String bread;
    private String condiments;
    private String veggies;
    private String fillings;

    private SubwaySandwich(Builder b){

    }

    public static Builder getBuilder(){
        return new Builder();
    }

    @Getter
    public static class Builder{
        private String bread;
        private String condiments;
        private String veggies;
        private String fillings;

        public void setBread(String bread) {
            this.bread = bread;
        }

        public void setCondiments(String condiments) {
            this.condiments = condiments;
        }

        public void setFillings(String fillings) {
            this.fillings = fillings;
        }

        public void setVeggies(String veggies) {
            this.veggies = veggies;
        }
        
        public SubwaySandwich build(){
            return new SubwaySandwich(this);
        }

    }
}
