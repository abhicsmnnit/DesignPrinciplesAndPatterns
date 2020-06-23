package com.example.patterns.abstractfactory;

import com.example.patterns.abstractfactory.app.Application;
import com.example.patterns.abstractfactory.factories.GUIFactory;
import com.example.patterns.abstractfactory.factories.MacOSFactory;
import com.example.patterns.abstractfactory.factories.WindowsFactory;

public class Demo {
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
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
