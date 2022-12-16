package abstractFactory.factories;

import abstractFactory.buttons.MacOSButton;
import abstractFactory.checkboxes.Checkbox;
import abstractFactory.checkboxes.MacOSCheckbox;
import abstractFactory.buttons.Button;

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