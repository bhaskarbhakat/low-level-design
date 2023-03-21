package com.DesignPattern.Factory.SimpleFactory.Button;


public class ButtonFactory {
    public static Button createButton(ButtonType type){
        switch (type) {
            case PRIMARY:
                return new PrimaryButton();
            case SECONDARY:
                return new SecondButton();
        }

        throw new RuntimeException("Invalid type" + type);
    }
}
