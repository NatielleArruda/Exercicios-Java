package Projeto1Mod;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int n1,n2,n3;
           Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com o primeiro n�mero: ");
		n1 = entrada.nextInt();
		System.out.print("Entre com o segundo n�mero: ");
		n2 = entrada.nextInt();
		System.out.print("Entre com o terceiro n�mero: ");
		n3 = entrada.nextInt();
		
		if(n1 < n2 && n2 < n3) {
			System.out.printf("\nA ordem crescente dos n�meros: "+n1+", "+n2+", "+n3);
		} else if((n1 < n2 && n3 < n2) && n1 < n3){
			System.out.printf("\nA ordem crescente dos n�meros: "+n1+", "+n3+", "+n2);
		}else if(n2 < n1 && n1 < n3) {
			System.out.printf("\nA ordem crescente dos n�meros: "+n2+", "+n1+", "+n3);
		} else if(n2 < n1 && n2 < n3) {
			System.out.printf("\nA ordem crescente dos n�meros: "+n2+", "+n3+", "+n1);
		} else if(n3 < n1 && n1 < n2) {
			System.out.printf("\n A ordem crescente dos n�meros: "+n3+", "+n1+", "+n2);
		} else {
			System.out.printf("\nA ordem crescente dos n�meros: "+n3+", "+n2+", "+n1);
		}

	}

}
