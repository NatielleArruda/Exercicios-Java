package Projeto1Mod;

import java.util.Scanner;

public class lacos_repeticao_3 {

	public static void main(String[] args) {
		
		
         Scanner entrada = new Scanner (System.in);
		
		int x,idade,totalP21=0,totalP50=0;
		
		System.out.println("\nInforme sua idade: ");
		idade = entrada.nextInt();
				
		while(idade!=-99)
		{
			if(idade<21)
			{
				totalP21++;
			}
			else if (idade>50)
			{
				totalP50++;
			}
			else
			{
				System.out.println("Idade não computada!");
			}
			System.out.println("\nInforme sua idade: ");
			idade = entrada.nextInt();
		}
		System.out.println("\nO total de pessoas com menos de 21 anos é de "+totalP21);
		System.out.println("\nO total de pessoas com mais de 50 anos é de "+totalP50);
	}

}
