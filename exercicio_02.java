package Projeto1Mod;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int dias, meses=12, R1, R2;
		
		System.out.println("\nCalculadora de anos, meses e dias: ");
		
		System.out.println("\nDigite sua idade em dias: ");
		dias = entrada.nextInt();
		
		R1 = dias/365;
		System.out.println("\nA sua idade é: "+R1+" anos.");
		
		R2 = R1 * meses;
		System.out.println("\nA sua idade é: "+R2+" meses");

	}

}
