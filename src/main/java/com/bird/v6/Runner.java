package com.bird.v6;

import com.bird.v6.interfaces.Flyable;

public class Runner {
    public static void main(String[] args) {
        Flyable sparrow = new Sparrow(50, 50, 50, new GlidingBehaviour());
        sparrow.fly();

        Flyable eagle = new Eagle(60, 50, 50, new FlappingBehaviour());
        eagle.fly();
    }
}

// Strategy design pattern,,,, switch behaviour at runtime
// Final implemantation



// Dependency Inversion

// High level modules (Parent) should not depent on other concrete classes. 
// In V5, Sparrow was depending on flapping behaviour class, we are unable to change behaviour in runtime, we can plug and play with behaviours to a concrete classes,
// so to solve this - 
// we created a interface named flying behaviour class and made flappingbehaviour implements flyingbehaviour

// This is how to achieve dependency inversion.