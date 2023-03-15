package com.bird.v2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public abstract class Bird {
    private int weight;
    private int height;
    private int size;
    public abstract void fly();
}
