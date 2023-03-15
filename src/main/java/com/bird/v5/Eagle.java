package com.bird.v5;

import com.bird.v5.interfaces.Flyable;

public class Eagle extends Bird implements Flyable {

    private GlidingBehaviour flyingBehaviour;

    public Eagle(int size, int weight, int height, GlidingBehaviour flyingBehaviour) {
        super(size, weight, height);
        this.flyingBehaviour = flyingBehaviour;
        //TODO Auto-generated constructor stub
    }

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        flyingBehaviour.makeFly();
    }
    
}
