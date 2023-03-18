package com.DesignPattern.Builder.Sandwich.v3;

public class Client {
    public static void main(String[] args) {
        SubwaySandwich b = SubwaySandwich.getBuilder()
                                    .setBread("sfda")
                                    .setCondiments("ifidsjg")
                                    .setFillings("34543")
                                    .setVeggies("tomato")
                                    .build();
    }
}
