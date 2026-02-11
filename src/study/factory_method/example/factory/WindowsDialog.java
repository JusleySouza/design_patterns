package study.factory_method.example.factory;

import study.factory_method.example.buttons.Button;
import study.factory_method.example.buttons.WindowsButton;

//A caixa de dialogo do Windows exibira os botoes do Windows.
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

}
