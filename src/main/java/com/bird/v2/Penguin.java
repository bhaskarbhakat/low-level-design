package com.bird.v2;

public class Penguin extends Bird {

    public Penguin(int weight, int height, int size) {
        super(weight, height, size);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        
        // Our design is forcing penguin to fly which is bad. 3rd Principle - Liskov substitution is used to fix these kind of problems.
    }
    
}
