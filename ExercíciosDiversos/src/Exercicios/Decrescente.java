package Exercicios;

import java.util.Scanner;

public class Decrescente {

	public static int Decresce () {
		int num =0;
		Scanner s = new Scanner(System.in);
		System.out.println("Digite um número");
		num =  s.nextInt();
		
		while (num>=1) {
			
			System.out.println(num);
			num = num - 1;
		}
		
		return 0;
		
	}
public static void main (String [] args) {
	Decresce();
	
}
}
