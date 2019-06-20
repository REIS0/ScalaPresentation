package Models;

import Interfaces.Desesperado;
import Interfaces.Lascado;

public class EstudanteCesarSchool extends Mamifero implements Lascado, Desesperado {
	
	public EstudanteCesarSchool(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public String sound() {
		return "joao fudeu meu find";
	}

	@Override
	public boolean isDesesperado() {
		return true;
	}

	@Override
	public boolean isLascado() {
		return true;
	}

}
