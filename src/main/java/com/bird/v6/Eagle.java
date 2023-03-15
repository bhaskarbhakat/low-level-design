package com.bird.v6;

import com.bird.v6.interfaces.Flyable;
import com.bird.v6.interfaces.FlyingBehaviour;

public class Eagle extends Bird implements Flyable {

    private FlyingBehaviour flyingBehaviour;

    public Eagle(int size, int weight, int height, FlyingBehaviour flyingBehaviour) {
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
