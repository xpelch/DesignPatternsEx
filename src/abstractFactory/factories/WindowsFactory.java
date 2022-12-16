package abstractFactory.factories;

import abstractFactory.buttons.WindowsButton;
import abstractFactory.checkboxes.Checkbox;
import abstractFactory.checkboxes.WindowsCheckbox;
import abstractFactory.buttons.Button;

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
