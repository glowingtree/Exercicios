package Exercicios;
import java.util.Scanner;


// imprimindo a idade em dias 

public class Idade {

	
	public static int Dias() {
		int ano;
		int meses;
		int dias;
		
		Scanner s = new Scanner (System.in);
		System.out.println("Digite sua idade em anos");
		ano = s.nextInt();
		ano = ano*365;
		System.out.println("Digite os meses depois do seu anivers�rio");
		meses =  s.nextInt();
		meses =  meses*30;
		System.out.println("Digite os dias");
		dias = s.nextInt();
		dias = ano + meses + dias;
		
		System.out.println("Sua idade em dias �: " + dias);
		return 0;
		
		
	}
	
	public static void main(String [] args) {
		
		Dias();
	}
}
