package creational.factory.factory;

import creational.factory.buttons.Button;
import creational.factory.buttons.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
