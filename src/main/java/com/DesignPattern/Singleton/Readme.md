# Singleton Design pattern:

## What is Singleton Design pattern?
    -> Its a creatiional DP.
    -> Only a single object is created for a class.

## When to use Singleton Design pattern?
    -> When we have a shared resource. ex: Logger, Database
    -> Class is stateless (Class that have no attributes)
    -> When objects are expensive to create
    -> When objects are immutable.
        . Objects with attributes
        . But the value of those attributes is never changed.

## How to make a class Singleton?

/v1
```java
Class Database{
    private String username;
    private String url;
    private String password;
    
    public Database(){}
}
// This is not a singleton class because anyone can create multiple instances

// client.java
    Database db1 = new Database();
    Database db2 = new Database();
```


/v2
```java
Class Database{
    private String username;
    private String url;
    private String password;
    
    private Database(){}
}
// If we make default constructor as private, then we can create any objects at all
```

/v3
```java
Class Database{
    private String username;
    private String url;
    private String password;
    
    private Database(){}

    public static Database createConnection(){
        return new Database();
    }
}
// This code is still not singleton because any one can call createConnection() method

// client.java
Database db1 = Database.createConnection();
Database db2 = Database.createConnection();

```

/v4
```java
Class Database{
    private String username;
    private String url;
    private String password;
    private static Database instance = null;

    private Database(){}

    public static Database createConnection(){
        if(instance == null)
            instance = new Database();
        
        return instance;
    }
}
// This code is now singleton. It will only create one object.
// This code is also known as lazy loading because we are creating object when its needed.
// But this code is not thread safe.

// client.java
Database db1 = Database.createConnection();
Database db2 = Database.createConnection();
```

/v5
```java
Class Database{
    private String username;
    private String url;
    private String password;
    private static Database instance = new Database();

    private Database(){}

    public static Database createConnection(){
        return instance;
    }
}

// client.java
Database db1 = Database.createConnection();
Database db2 = Database.createConnection();

// This solution handles concurrency, its called eager loading because we are loading the attributes earlier.

// Problem 1: Application startup will become slow/ class loading becomes slow.
// Problem 2: This solution won't work cuz information I need is not available at class load time.
```

/v6
```java
Class Database{
    private String username;
    private String url;
    private String password;
    private static Database instance = null;

    private Database(){}

    public synchronized static Database createConnection(){
        if(instance == null)
            instance = new Database();
        
        return instance;
    }
}
// Simplest solution to solve concurrency is to use synchronized keyword
// Solution will work but it will impact performance issue as all the threads had to wait.
```

/v6
```java
Class Database{
    private String username;
    private String url;
    private String password;
    private static Database instance;

    private Database(){}

    public static Database createConnection(){

        if(instance == null){
            synchronized(){
                if(instance == null)
                    instance = new Database();
            }
        }

        return instance;
    }
}

// client.java
Database db1 = Database.createConnection();
Database db2 = Database.createConnection();

- This solution is called double lock checking. [Standard approach]

```

