package com.lvh.creational.builder;

public class Demo {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder("Le Viet", "Hoang")
                .age(20)
                .phone("1231231")
                .address("HN")
                .build();
        System.out.println(user1);

        User user2 = new User.UserBuilder("Le Viet", "Hoang")
                .age(22)
                .phone("12312312")
                .build();
        System.out.println(user2);

        User user3 = new User.UserBuilder("Le Viet", "Hoang")
                .build();
        System.out.println(user3);
    }
}
