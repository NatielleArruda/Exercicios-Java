package Projeto1Mod;

import java.util.Scanner;

public class exerc�cio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2, num3;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\nDigite o primeiro N�mero: ");
		num1 = entrada.nextInt();
		System.out.println("\nDigite o segundo N�mero: ");
		num2 = entrada.nextInt();
		System.out.println("\nDigite o terceiro N�mero: ");
		num3 = entrada.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.printf("\nPrimeiro n�mero, "+num1+", � o maior!");
		} else if (num2 > num1 && num2 > num3){
			System.out.printf("O segundo n�mero: , "+num2+", � o maior!");
		} else {
			System.out.printf("O terceiro n�mero: "+num3+", � o maior!");
		
		}
		
	}

}
