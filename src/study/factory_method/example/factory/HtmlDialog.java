package study.factory_method.example.factory;

import study.factory_method.example.buttons.Button;
import study.factory_method.example.buttons.HtmlButton;

//A caixa de dialogo HTML ira gerar botoes HTML.
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }

}
