package study.factory_method.example.factory;

import study.factory_method.example.buttons.Button;

 // Classe base de fabrica.
public abstract class Dialog {

    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

  // As subclasses irao sobrescrever este metodo para criar objetos de botao especificos.
    public abstract Button createButton();

}
