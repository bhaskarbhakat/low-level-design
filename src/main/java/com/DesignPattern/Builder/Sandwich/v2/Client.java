package com.DesignPattern.Builder.Sandwich.v2;


public class Client {
    public static void main(String[] args) {
        SubwaySandwich.Builder b = SubwaySandwich.getBuilder();
        b.setBread("sfsdf");
        b.setCondiments("asdjfk");

        SubwaySandwich s = b.build();
    }
}
