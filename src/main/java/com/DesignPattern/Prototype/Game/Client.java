package com.DesignPattern.Prototype.Game;

public class Client {
    public static void main(String[] args) {
        // Step 4: Create a prototype
        ForegroundObject prototype = new ForegroundObject(100, 100, 200, 300, "blue", GraphicalObjectType.FOREGROUND);
        ForegroundObject clone = prototype.clone();

        // Step 5: Modify the clone
        clone.setX(600);
        clone.setY(400);
    }
}
