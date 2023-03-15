package com.bird.v5;

import com.bird.v5.interfaces.Flyable;

public class Sparrow extends Bird implements Flyable{

    private FlappingBehaviour flyingBehaviour;

    public Sparrow(int size, int weight, int height, FlappingBehaviour flyingBehaviour) {
        super(size, weight, height);
        this.flyingBehaviour = flyingBehaviour;
        //TODO Auto-generated constructor stub
    }

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        flyingBehaviour.doFly();
    }
    
}
