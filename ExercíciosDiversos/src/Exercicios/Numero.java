package Exercicios;

import java.util.Scanner;

// Número anterior posterior 
public class Numero {
	
	public static int Num () {
		int n = 0;
		
		Scanner s = new Scanner (System.in);
		System.out.println("Digite um número");
		n =  s.nextInt();
		
		System.out.println("O número anterior é " + (n-1) + " e o número seguinte é " + (n+1));
		
		
		
		return 0;
		
	}

	public static void main (String [] args) {
		
		Num();
	}
	
}
