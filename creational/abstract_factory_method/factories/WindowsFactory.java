package com.lvh.creational.abstract_factory_method.factories;

import com.lvh.creational.abstract_factory_method.buttons.Button;
import com.lvh.creational.abstract_factory_method.buttons.WindowsButton;
import com.lvh.creational.abstract_factory_method.checkboxes.Checkbox;
import com.lvh.creational.abstract_factory_method.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
