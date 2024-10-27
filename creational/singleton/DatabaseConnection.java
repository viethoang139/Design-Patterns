package com.lvh.creational.singleton;

public class DatabaseConnection {
    private static DatabaseConnection instance;

    private DatabaseConnection(){
        System.out.println("Database connection established.");
    }

    public static synchronized DatabaseConnection getInstance(){
        if(instance == null){
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void query(String sql){
        System.out.println("Executing query: " + sql);
    }


}
