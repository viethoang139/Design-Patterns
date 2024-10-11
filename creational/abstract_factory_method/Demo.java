package com.lvh.creational.abstract_factory_method;

import com.lvh.creational.abstract_factory_method.app.Application;
import com.lvh.creational.abstract_factory_method.factories.GUIFactory;
import com.lvh.creational.abstract_factory_method.factories.MacOSFactory;
import com.lvh.creational.abstract_factory_method.factories.WindowsFactory;

public class Demo {

    private static Application configureApplication(){
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if(osName.contains("mac")){
            factory = new MacOSFactory();
        }
        else{
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }
    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
