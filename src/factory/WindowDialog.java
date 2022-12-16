package factory;

import factory.buttons.Button;
import factory.buttons.WindowButton;

// Concrete CreatorB
public class WindowDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowButton();
    }
}
