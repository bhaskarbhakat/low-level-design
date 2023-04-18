package com.DesignPattern.Prototype.Game;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ForegroundObject implements GraphicalObject{

        
    private Integer x;
    private Integer y;
    private Integer width;
    private Integer height;
    private String color;
    private GraphicalObjectType type;

    public ForegroundObject(Integer x, Integer y, Integer width, Integer height, String color, GraphicalObjectType type){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color =  color;
        this.type = type;
    }

    @Override
    public ForegroundObject clone(){
        ForegroundObject clone = new ForegroundObject(x, y, width, height, color, type);
        clone.x = x;
        clone.y = y;
        clone.width = width;
        clone.height = height;
        clone.color =  color;
        clone.type = type;
        return clone;
    }
    
}
