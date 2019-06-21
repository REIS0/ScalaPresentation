package util;

import java.util.ArrayList;
import java.util.List;

public class MultiplosDeDois {

	private List<Integer> lista = new ArrayList<>();
	
	public List<Integer> multiplos(int v1) {
		for (; v1 < 2; v1--) {
			if (v1%2==0) {
				lista.add(v1);
			} else {
				continue;
			}
		}
		return lista;
	}
	
}
