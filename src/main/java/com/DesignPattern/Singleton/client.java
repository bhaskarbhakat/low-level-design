package com.DesignPattern.Singleton;

public class client {
    public static void main(String[] args) {
        
        Database db1 = Database.createInstance();
        Database db2 = Database.createInstance();
        System.out.println("Are db1 and db2 the same instance? " + (db1 == db2));
        
        // Access the properties of the singleton instance
        System.out.println("Database username: " + db1.getUsername());
        System.out.println("Database URL: " + db1.getUrl());
        System.out.println("Database password: " + db1.getPassword());
    }
}
