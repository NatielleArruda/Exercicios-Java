package Projeto1Mod;

import java.util.Scanner;

public class exercício9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2, num3;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\nDigite o primeiro Número: ");
		num1 = entrada.nextInt();
		System.out.println("\nDigite o segundo Número: ");
		num2 = entrada.nextInt();
		System.out.println("\nDigite o terceiro Número: ");
		num3 = entrada.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.printf("\nPrimeiro número, "+num1+", é o maior!");
		} else if (num2 > num1 && num2 > num3){
			System.out.printf("O segundo número: , "+num2+", é o maior!");
		} else {
			System.out.printf("O terceiro número: "+num3+", é o maior!");
		
		}
		
	}

}
