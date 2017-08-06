package ejemploArrayList;

import java.util.ArrayList;


public class ejemploBase {

	public static void main(String[] args) {
		ArrayList<Integer> nros = new ArrayList<Integer>();
		nros.add(10);
		nros.add(20);
		
		
		mostrar(nros);
		
	}

	private static void mostrar(ArrayList<Integer> nros) {
		for (Integer n : nros){
			System.out.println(n);
		}
	}

}
