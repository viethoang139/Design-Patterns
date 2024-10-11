package com.lvh.creational.abstract_factory_method.factories;

import com.lvh.creational.abstract_factory_method.buttons.Button;
import com.lvh.creational.abstract_factory_method.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
