package Exercicios;

import java.util.Scanner;

// imprimir saldo com reajuste

public class Saldo {

	public static float Imprimir () {
		
		float saldo; 
		float reajuste; 
		
		Scanner s = new Scanner (System.in);
		System.out.println("Digite seu saldo");
		saldo = s.nextFloat();
		System.out.println("Digite o reajuste desejado");
		reajuste = s.nextFloat();
		reajuste = saldo / (reajuste*100);
		saldo = saldo + reajuste;
		System.out.println("O valor com reajuste é:  " + saldo);
		return 0;
		
		
	}
	public static void main (String [] args) {
		Imprimir();
		
	}
}
