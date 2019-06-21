package models;

public class Arrombado extends Mamifero {

	public Arrombado(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public String sound() {
		return "perdi";
	}

}
