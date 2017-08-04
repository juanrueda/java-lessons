package ej01;
import java.util.Scanner;

public class InvertirNumeros {

	public static void main(String[] args) {
		
		int nros[] = new int[10];
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i<nros.length; i++){
			System.out.println("Ingresar numero: ");
			nros[i] = Integer.parseInt(s.nextLine());
		}
		
		for(int i = nros.length-1; i>=0; i--){
			System.out.println(nros[i]);
		}
		s.close();

	}

}
