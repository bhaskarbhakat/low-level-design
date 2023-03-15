package com.bird.v4;

import com.bird.v4.interfaces.Flyable;

public class Sparrow extends Bird implements Flyable{

    public Sparrow(int height, int weight, int size) {
        super(height, weight, size);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        System.out.println("I am Sparrow and I am flying");
    }
    
}
