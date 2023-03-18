package com.snakeandladder.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Obstacle {
    private int head;
    private int tail;
    
    public abstract int getNextLocation();
}
