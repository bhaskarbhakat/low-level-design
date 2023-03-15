package com.bird.v0;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Bird {
    private int weight;
    private int height;
    private BirdType type;

    public void fly(){
        if(this.type == BirdType.PARROT){
            System.out.println("parrot");
        }
        else if(this.type == BirdType.SPARROW){
            System.out.println("sparrow");
        }
    }
}
