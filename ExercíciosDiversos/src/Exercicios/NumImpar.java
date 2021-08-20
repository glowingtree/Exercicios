package Exercicios;

import java.util.Scanner;

public class NumImpar {

	public static int SomaImpar () {
		int t = 0;
		int m = 0;
		int c = 0;
		
		for (int n = 0; n<=29;  n++) {
			
			if (n % 2 == 0) {
				
				m = n;
				t = n*m;
				System.out.println(t);
			}
		
		}
		
		return 0;
		
		
	}
		 

	 public static void main(String[] args) {

	   Scanner scanner=new Scanner(System.in);

	   int inicio=0;

	   int par=0;

	   int im=0;

	   while(true){

	     if(inicio ==31){

	       break;

	     }

	     if(inicio %2==0){

	       par=par+inicio;

	     }else{

	       im=im+inicio;

	     }

	     inicio++;

	   }

	   System.out.println("Os numeros pares somados são:"+par);

	   System.out.println("Os numeros impares somados são:"+im);

	 }
}
