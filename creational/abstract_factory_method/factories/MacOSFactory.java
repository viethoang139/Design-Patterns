package com.lvh.creational.abstract_factory_method.factories;

import com.lvh.creational.abstract_factory_method.buttons.Button;
import com.lvh.creational.abstract_factory_method.buttons.MacOSButton;
import com.lvh.creational.abstract_factory_method.checkboxes.Checkbox;
import com.lvh.creational.abstract_factory_method.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
