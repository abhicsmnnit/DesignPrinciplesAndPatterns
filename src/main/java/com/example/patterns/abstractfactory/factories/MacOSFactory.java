package com.example.patterns.abstractfactory.factories;

import com.example.patterns.abstractfactory.products.buttons.Button;
import com.example.patterns.abstractfactory.products.buttons.MacOSButton;
import com.example.patterns.abstractfactory.products.checkboxes.Checkbox;
import com.example.patterns.abstractfactory.products.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
