package study.abstract_factory.example.checkboxes;

//Variante de uma caixa de selecao para Windows.
public class WindowsCheckbox implements Checkbox {

	@Override
	public void paint() {
		System.out.println("You have created WindowsCheckbox.");	
	}

}
