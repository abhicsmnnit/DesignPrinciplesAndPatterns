package com.example.patterns.abstractfactory.app;

import com.example.patterns.abstractfactory.products.buttons.Button;
import com.example.patterns.abstractfactory.products.checkboxes.Checkbox;
import com.example.patterns.abstractfactory.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}