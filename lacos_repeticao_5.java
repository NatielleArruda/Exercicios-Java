package Projeto1Mod;

import java.util.Scanner;

public class lacos_repeticao_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner leia = new Scanner (System.in);
		
		int numero, somaNum=0;
		
			System.out.println("\nEntre com um n�mero: ");
			numero=leia.nextInt();
			
		do
		{
			somaNum+=numero;
			System.out.println("Entre com um n�mero: ");
			numero=leia.nextInt();
			
			
		}while(numero!=0);
		
		System.out.println("A somat�ria dos n�meros informados foi de "+somaNum);

	}

}
