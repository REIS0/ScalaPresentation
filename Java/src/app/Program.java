package app;

import enums.Grupo;
import util.MultiplosDeDois;

public class Program {

	public String quemTaApresentando(Grupo apresentador) {
		switch (apresentador) {
		case ANDRE:
			return "cookies";
		case BOLINHO:
			return "bulinhu";
		case LEO:
			return "vai dormir leo";
		case REISO:
			return "sou eu mesmo";
		}
		return null;
	}
	
	public static void main(String[] args) {
		
		MultiplosDeDois multiplos = new MultiplosDeDois();
		
		System.out.println(multiplos.multiplos(40));

	}

}
