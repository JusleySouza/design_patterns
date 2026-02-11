package study.abstract_factory.example.checkboxes;

//Variante de uma caixa de selecao para MacOS.
public class MacOSCheckbox implements Checkbox {

	@Override
	public void paint() {
		System.out.println("You have created MacOSCheckbox.");	
	}

}
