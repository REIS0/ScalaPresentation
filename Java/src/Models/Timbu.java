package Models;

public class Timbu extends Mamifero {

	public Timbu(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public String sound() {
		return "squeek";
	}

}
