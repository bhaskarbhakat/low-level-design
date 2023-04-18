package com.DesignPattern.Prototype.Game;

import java.util.HashMap;
import java.util.Map;

public class GameRegistry {
    
    private Map<GraphicalObjectType, GraphicalObject> registry =  new HashMap<>();
    public void addPrototype(GraphicalObjectType type, GraphicalObject object){
        this.registry.put(type, object);
    }

    public GraphicalObject getPrototype(GraphicalObjectType type){
        return this.registry.get(type);
    }
}
