package creational.abstract_factory.factories;

import creational.abstract_factory.buttons.Button;
import creational.abstract_factory.buttons.WindowsButton;
import creational.abstract_factory.checkboxes.Checkbox;
import creational.abstract_factory.checkboxes.WindowsCheckbox;

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
