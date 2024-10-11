package com.lvh.creational.abstract_factory_method.buttons;

public class WindowsButton implements Button{

    @Override
    public void paint() {
        System.out.println("You have created WindowsButton");
    }
}
