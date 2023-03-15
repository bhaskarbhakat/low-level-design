package com.bird.v5;

import com.bird.v5.interfaces.Flyable;

public class Runner {
    public static void main(String[] args) {
        Flyable sparrow = new Sparrow(50, 50, 50, new FlappingBehaviour());
        sparrow.fly();

        Flyable eagle = new Eagle(60, 50, 50, new GlidingBehaviour());
        eagle.fly();
    }
}

// sparrow class - concrete
// flappingBehaviour - concrete
// no two concrete classes should depend on each other
// to avoid this we can use interfaces

// sparrow and flappingBehaviour are tightly coupled
