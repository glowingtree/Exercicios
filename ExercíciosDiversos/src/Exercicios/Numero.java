package Exercicios;

import java.util.Scanner;

// N�mero anterior posterior 
public class Numero {
	
	public static int Num () {
		int n = 0;
		
		Scanner s = new Scanner (System.in);
		System.out.println("Digite um n�mero");
		n =  s.nextInt();
		
		System.out.println("O n�mero anterior � " + (n-1) + " e o n�mero seguinte � " + (n+1));
		
		
		
		return 0;
		
	}

	public static void main (String [] args) {
		
		Num();
	}
	
}
