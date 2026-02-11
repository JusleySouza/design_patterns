package study.abstract_factory.example;

import study.abstract_factory.example.app.Application;
import study.abstract_factory.example.factories.GUIFactory;
import study.abstract_factory.example.factories.MacOSFactory;
import study.abstract_factory.example.factories.WindowsFactory;

public class Demo {
	
	//O aplicativo seleciona o tipo de fabrica e a cria em tempo de execucao, dependendo da configuracao ou das variaveis de ambiente
	 private static Application configureApplication() {
	        Application app;
	        GUIFactory factory;
	        String osName = System.getProperty("os.name").toLowerCase();
	        if (osName.contains("mac")) {
	            factory = new MacOSFactory();
	        } else {
	            factory = new WindowsFactory();
	        }
	        app = new Application(factory);
	        return app;
	    }

	public static void main(String[] args) {
		Application app = configureApplication();
        app.paint();
	}

}
