package study.factory_method.example;

import study.factory_method.example.factory.Dialog;
import study.factory_method.example.factory.HtmlDialog;
import study.factory_method.example.factory.WindowsDialog;

public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

   //A fabrica eh escolhida conforme a configuraçao ou as variaveis de ambientes setadas.
    static void configure() {
        if (System.getProperty("os.name").equals("Windows 11")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

   //	Todo o codigo do cliente deve funcionar com fabricas e produtos por meio de interfaces abstratas.
    static void runBusinessLogic() {
        dialog.renderWindow();
    }

}
