package Exercicios;

import java.util.Scanner;

//imprimir o maior n�mero entre 2 

public class MaiorNum {

	public static int Num () {
		
		int a, b;
		Scanner s = new Scanner (System.in);
		System.out.println("Digite um n�mero");
		a = s.nextInt();
		System.out.println("Digite outro n�mero");
		b = s.nextInt();
		
		
		if (a>b) {
			System.out.println("O maior n�mero � "+ a);
		} else if(b>a){
			System.out.println("O maior n�mero � "+ b);
		} else if (a==b){
			System.out.println("Os n�meros s�o iguais");
		}
		
		
		
	
		return 0;
	}
	public static void main(String [] args) {
		Num();
	}
}
