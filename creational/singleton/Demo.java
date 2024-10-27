package com.lvh.creational.singleton;

public class Demo {
    public static void main(String[] args) {
        DatabaseConnection connection1 = DatabaseConnection.getInstance();
        connection1.query("SELECT * FROM users");

        DatabaseConnection connection2 = DatabaseConnection.getInstance();
        connection2.query("SELECT * FROM orders");

        System.out.println(connection1 == connection2);
    }
}
