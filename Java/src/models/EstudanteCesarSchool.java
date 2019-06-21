package models;

import interfaces.Desesperado;
import interfaces.Lascado;

public class EstudanteCesarSchool extends Mamifero implements Lascado, Desesperado {
	
	public EstudanteCesarSchool(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public String sound() {
		return "to cansado";
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
