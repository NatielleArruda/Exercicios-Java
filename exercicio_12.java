package Projeto1Mod;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner entrada = new Scanner(System.in);
		
		double num;
				
		System.out.print("Entre com um n�mero: ");
		num = entrada.nextFloat();

		if((num%2==0)) {
			System.out.printf("O n�mero "+num+" � par e sua ra�z quadrada � %.2f",Math.sqrt(num));
		} else {
			System.out.println("O n�mero "+num+" � �mpar e elevado ao quadrado � "+Math.pow(num, 2));
		}

	}

}
