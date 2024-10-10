package com.lvh.creational.factory_method.factory;

import com.lvh.creational.factory_method.buttons.Button;
import com.lvh.creational.factory_method.buttons.WindowsButton;

public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
