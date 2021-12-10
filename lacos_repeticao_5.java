package Projeto1Mod;

import java.util.Scanner;

public class lacos_repeticao_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner leia = new Scanner (System.in);
		
		int numero, somaNum=0;
		
			System.out.println("\nEntre com um número: ");
			numero=leia.nextInt();
			
		do
		{
			somaNum+=numero;
			System.out.println("Entre com um número: ");
			numero=leia.nextInt();
			
			
		}while(numero!=0);
		
		System.out.println("A somatória dos números informados foi de "+somaNum);

	}

}
