package Exercicios;

import java.util.Scanner;


//calcular o valor com IPI
public class CalculoIPI {

	
	public static float Calcula () {
		
		float valor1 = 0;
		int quant1 = 0 ;
		float valor2  = 0;
		int quant2 = 0;
		float ipi = 0;
		float total = 0;
		
		Scanner s =  new Scanner  (System.in);
		
		System.out.println("Digite o valor do IPI");
		ipi = s.nextFloat();
		
		System.out.println("Digite o valor da peça 1");
		valor1 = s.nextFloat();
		
		System.out.println("Digite a quantidade da  peça 1");
		quant1 = s.nextInt();
		
		System.out.println("Digite o valor da peça 2");
		valor2 = s.nextFloat();
		
		System.out.println("Digite a quantidade da peça 2");
		quant2 = s.nextInt();
		
		total = (valor1*quant1 + valor2*quant2)*(ipi/100 + 1);
		
		System.out.println("O valor total é: " + String.format("%.2f", total));

		
		
		return 0; 
		
		
	}
	
	public static void main (String [] args) {
		
		Calcula();
		
	}
}
