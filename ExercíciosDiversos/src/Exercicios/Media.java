package Exercicios;

// imprimindo duas m�dias
public class Media {
	
	static double m1;
	static double m2;
	static double m3;
	
	
	public static double Imprimir  () {
		m1 = (4+5+6)/3;
		m2 = (8+9+7)/3;
		System.out.println("A soma das m�dias: " + m1+m2 + "\n" + "A m�dia das m�dias: " + (m1+m2)/2);

		return 0;
		
	}
	public static void main(String [] args) {
		Imprimir();
		
	}
}
