package com.DesignPattern.Builder.Sandwich.v3;


import lombok.Getter;

@Getter
public class SubwaySandwich {
    private String bread;
    private String condiments;
    private String veggies;
    private String fillings;

    // Step 1: Create a private constructor so that no one can call from outside
    private SubwaySandwich(Builder b){
        // validate(b);
        this.bread = b.bread;
        this.condiments = b.condiments;
        this.fillings = b.fillings;
        this.veggies = b.veggies;
        // ...
    }

    // Step 2: Create a public static Builder getBuilder function to create obj of builder, 
    // so that client just have to call getBuilder method to create an obj of builder class.
    public static Builder getBuilder(){
        return new Builder();
    }

    // Step 3: Create a public static class Builder so that Builder class can be call from client.
    @Getter
    public static class Builder{
        private String bread;
        private String condiments;
        private String veggies;
        private String fillings;

        // step 4: Add setters
        public Builder setBread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder setCondiments(String condiments) {
            this.condiments = condiments;
            return this;
        }

        public Builder setFillings(String fillings) {
            this.fillings = fillings;
            return this;
        }

        public Builder setVeggies(String veggies) {
            this.veggies = veggies;
            return this;
        }

        // step 5: Add build method to create an object for main class
        public SubwaySandwich build(){
            return new SubwaySandwich(this);
        }

    }


}
