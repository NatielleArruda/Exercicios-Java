package Projeto1Mod;

import java.util.Scanner;

public class lacos_repeticao_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, numero, par=  0, impar=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(i=0; i>=10; i++);
		{
		    System.out.println("\nDigite um úmero: ");
		    numero = leia.nextInt();
			if(numero % 2 == 0);
			{
				par++;
			}
			{
				impar++;
			  }
			
		}
		System.out.println("São "+par+" par e "+impar+" impar.");
		
				
	}

}
