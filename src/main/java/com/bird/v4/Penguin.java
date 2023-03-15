package com.bird.v4;

import com.bird.v4.interfaces.Swimmable;

public class Penguin extends Bird implements Swimmable{

    public Penguin(int height, int weight, int size) {
        super(height, weight, size);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void swim() {
        // TODO Auto-generated method stub
        System.out.println("I am penguin and I am swimming");
    }
    
}
