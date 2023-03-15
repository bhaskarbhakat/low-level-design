package com.bird.v0;

public class Runner {
    public static void main(String[] args) {
        Bird sparrow = new Bird(56, 180, BirdType.SPARROW);
        sparrow.fly();

        Bird parrot = new Bird(65, 180, BirdType.PARROT);
        parrot.fly();
    }
}
