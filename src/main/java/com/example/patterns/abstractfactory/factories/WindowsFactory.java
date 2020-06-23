package com.example.patterns.abstractfactory.factories;

import com.example.patterns.abstractfactory.products.buttons.Button;
import com.example.patterns.abstractfactory.products.buttons.WindowsButton;
import com.example.patterns.abstractfactory.products.checkboxes.Checkbox;
import com.example.patterns.abstractfactory.products.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}