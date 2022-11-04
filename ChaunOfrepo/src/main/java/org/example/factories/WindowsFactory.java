package org.example.factories;

import org.example.buttons.Button;
import org.example.buttons.WindowsButton;
import org.example.checkboxes.Checkbox;
import org.example.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
