package com.DesignPattern.Singleton;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Database {
    private String username;
    private String password;
    private String url;
    private static Database instance = null;


    public static Database createInstance(){
        if(instance == null){
            instance = new Database("admin","password","url");
        }
        return instance;
    }
}

