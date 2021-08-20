package Exercicios;

import java.util.Scanner;

//imprimir o maior número entre 2 

public class MaiorNum {

	public static int Num () {
		
		int a, b;
		Scanner s = new Scanner (System.in);
		System.out.println("Digite um número");
		a = s.nextInt();
		System.out.println("Digite outro número");
		b = s.nextInt();
		
		
		if (a>b) {
			System.out.println("O maior número é "+ a);
		} else if(b>a){
			System.out.println("O maior número é "+ b);
		} else if (a==b){
			System.out.println("Os números são iguais");
		}
		
		
		
	
		return 0;
	}
	public static void main(String [] args) {
		Num();
	}
}
