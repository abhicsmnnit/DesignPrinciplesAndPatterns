package com.example.patterns.abstractfactory.factories;

import com.example.patterns.abstractfactory.products.buttons.Button;
import com.example.patterns.abstractfactory.products.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
