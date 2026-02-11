package study.abstract_factory.example.buttons;

//Variante de botao para MacOS.
public class MacOSButton implements Button{

	@Override
	public void paint() {
		System.out.println("You have created MacOSButton.");	
	}

}
