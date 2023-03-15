package com.bird.v2;

public class Runner {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow(50, 180, 5);
        sparrow.fly();

        Bird parrot = new Parrot(70, 180, 5);
        parrot.fly();
    }
}
