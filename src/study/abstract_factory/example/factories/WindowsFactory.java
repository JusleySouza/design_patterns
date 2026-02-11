package study.abstract_factory.example.factories;

import study.abstract_factory.example.buttons.Button;
import study.abstract_factory.example.buttons.WindowsButton;
import study.abstract_factory.example.checkboxes.Checkbox;
import study.abstract_factory.example.checkboxes.WindowsCheckbox;

//fabrica responsavel pela criacao de produtos Windows.
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
