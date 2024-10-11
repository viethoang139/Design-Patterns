package com.lvh.creational.abstract_factory_method.app;

import com.lvh.creational.abstract_factory_method.buttons.Button;
import com.lvh.creational.abstract_factory_method.checkboxes.Checkbox;
import com.lvh.creational.abstract_factory_method.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory){
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();;
    }

}
