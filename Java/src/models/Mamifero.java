package models;

import interfaces.Animal;

public abstract class Mamifero implements Animal {

	final protected String nome;
	final protected int idade;
	
	public Mamifero(String nome, int idade) {
		this.idade = idade;
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}

	public String getNome() {
		return nome;
	}

}
