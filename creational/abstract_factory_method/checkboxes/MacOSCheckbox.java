package com.lvh.creational.abstract_factory_method.checkboxes;

public class MacOSCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox");
    }
}
