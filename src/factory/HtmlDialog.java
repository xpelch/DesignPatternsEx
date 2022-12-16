package factory;

import factory.buttons.Button;
import factory.buttons.HtmlButton;

// Concrete CreatorA
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
