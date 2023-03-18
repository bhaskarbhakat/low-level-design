package com.DesignPattern.Builder.Sandwich.v3;

public class Client {
    public static void main(String[] args) {
        SubwaySandwich b = SubwaySandwich.getBuilder()
                                    .setBread("sfda")
                                    .setFillings("34543")
                                    .setVeggies("tomato")
                                    .build();

        System.out.println(b.getBread());
        System.out.println(b.getCondiments());
        System.out.println(b.getFillings());
        System.out.println(b.getVeggies());
    }
}
