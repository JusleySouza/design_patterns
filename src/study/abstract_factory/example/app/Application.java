package study.abstract_factory.example.app;

import study.abstract_factory.example.buttons.Button;
import study.abstract_factory.example.checkboxes.Checkbox;
import study.abstract_factory.example.factories.GUIFactory;

// Os usuarios da fabrica nao se importam com qual fabrica concreta utilizam, ja que trabalham com fabricas e produtos por meio de interfaces abstratas.
public class Application {
	
	private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }

}
