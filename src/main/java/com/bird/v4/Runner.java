package com.bird.v4;

import com.bird.v4.interfaces.Flyable;
import com.bird.v4.interfaces.Swimmable;

public class Runner {
    public static void main(String[] args) {
        Flyable sparrow = new Sparrow(50, 50, 50);
        sparrow.fly();

        Swimmable penguin = new Penguin(60, 60, 60);
        penguin.swim();
    }
}
 