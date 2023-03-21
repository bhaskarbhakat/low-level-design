package com.DesignPattern.Factory.SimpleFactory.Button;

public class Client {
    public static void main(String[] args) {
        Button primary = ButtonFactory.createButton(ButtonType.PRIMARY);
        primary.render();
        Button secondary = ButtonFactory.createButton(ButtonType.SECONDARY);
        secondary.render();

    }
}
