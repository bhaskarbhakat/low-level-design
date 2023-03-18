package com.DesignPattern.Builder.Sandwich.v1;

public class Client {
    public static void main(String[] args) {
        Builder b = new Builder();
        b.bread = "sfd";
        b.condiments = "cheese";

        SubwaySandwich s = new SubwaySandwich(b);
    }
}
