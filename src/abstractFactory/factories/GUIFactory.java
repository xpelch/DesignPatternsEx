package abstractFactory.factories;

import abstractFactory.checkboxes.Checkbox;
import abstractFactory.buttons.Button;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
