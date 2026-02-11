package study.abstract_factory.example.factories;

import study.abstract_factory.example.buttons.Button;
import study.abstract_factory.example.buttons.MacOSButton;
import study.abstract_factory.example.checkboxes.Checkbox;
import study.abstract_factory.example.checkboxes.MacOSCheckbox;

//Cada fabrica concreta amplia a fabrica basica e eh responsavel pela criacao de produtos de uma unica variedade.
//fabrica responsavel pela criacao de produtos MacOS.
public class MacOSFactory implements GUIFactory{

	@Override
	public Button createButton() {
		return new MacOSButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new MacOSCheckbox();
	}

}
