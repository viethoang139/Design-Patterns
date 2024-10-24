package com.lvh.creational.simple_factory;

public class Demo {
    public static void main(String[] args) {
        Door door = DoorFactory.makeDoor(100,200);

        System.out.println("Width: " + door.getWidth());

        System.out.println("Height: " + door.getHeight());

        Door door1 = DoorFactory.makeDoor(200,300);

        System.out.println("Width: " + door1.getWidth());

        System.out.println("Height: " + door1.getHeight());

    }
}
