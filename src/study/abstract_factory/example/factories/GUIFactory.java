package study.abstract_factory.example.factories;

import study.abstract_factory.example.buttons.Button;
import study.abstract_factory.example.checkboxes.Checkbox;

//A fabrica abstrata conhece todos os tipos de produtos (abstratos).
public interface GUIFactory {
	Button createButton();
    Checkbox createCheckbox();
}
