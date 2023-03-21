package com.DesignPattern.Factory.SimpleFactory.Button;

public class SecondButton implements Button{
    @Override
    public void render() {
        System.out.println("Secondary Button");
    }
}
