package com.DesignPattern.Prototype.Game;


public class ClientRegistry {
    
    public static void main(String[] args) {

        GameRegistry registry = new GameRegistry();

        ForegroundObject prototype = new ForegroundObject(100, 100, 200, 300, "blue", GraphicalObjectType.FOREGROUND);
        registry.addPrototype(prototype.getType(), prototype);

        GraphicalObject clone = registry.getPrototype(GraphicalObjectType.FOREGROUND).clone();
    }
}
