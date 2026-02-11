package study.abstract_factory.example.buttons;

//Variante de botao para Windows.
public class WindowsButton implements Button {

	@Override
	public void paint() {
		System.out.println("You have created WindowsButton.");
	}

}
