package ej02;

import java.util.Scanner;

public class NumerosMayores {
	public static void main(String[] args)
	{
		int nro, j=0;
		int[] numeros = new int[20];
		int[] mayores = new int[20];
		System.out.println("Ingrese un numero entero inicial");
		Scanner s = new Scanner(System.in);
		nro = s.nextInt();
		for(int i = 0; i<20; i++)
		{
			System.out.println("Ingrese numero entero");
			numeros[i] = s.nextInt();
		}
		for(int i = 0; i<numeros.length;i++)
		{
			if(numeros[i]>nro)
			{
				mayores[j] = numeros[i];
				j++;
			}
		}
		System.out.println("Numeros mayores al numero inicial");
		for(int i=0; i<j; i++)
		{
			System.out.println(mayores[i]);
		}
		s.close();
	}

}
