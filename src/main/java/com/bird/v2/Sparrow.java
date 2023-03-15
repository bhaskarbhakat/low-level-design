package com.bird.v2;

public class Sparrow extends Bird {

    public Sparrow(int weight, int height, int size) {
        super(weight, height, size);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void fly(){
        System.out.println("Sparrow is flying");
    }
}
