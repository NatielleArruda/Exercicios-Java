package Projeto1Mod;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner entrada = new Scanner(System.in);
		
		double num;
				
		System.out.print("Entre com um número: ");
		num = entrada.nextFloat();

		if((num%2==0)) {
			System.out.printf("O número "+num+" é par e sua raíz quadrada é %.2f",Math.sqrt(num));
		} else {
			System.out.println("O número "+num+" é ímpar e elevado ao quadrado é "+Math.pow(num, 2));
		}

	}

}
