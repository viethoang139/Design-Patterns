package com.lvh.creational.factory_method;

import com.lvh.creational.factory_method.factory.Dialog;
import com.lvh.creational.factory_method.factory.HtmlDialog;
import com.lvh.creational.factory_method.factory.WindowsDialog;

public class Demo {
    private static Dialog dialog;
    
    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    private static void runBusinessLogic() {
        dialog.renderWindow();
    }

    private static void configure() {
        if(System.getProperty("os.name").equals("Windows 11")){
            dialog = new WindowsDialog();
        }
        else{
            dialog = new HtmlDialog();
        }
    }

}
