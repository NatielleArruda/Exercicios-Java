package Projeto1Mod;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		 double n1, n2, n3, p1, p2, p3, media;
		 
		 System.out.println("\nPrograma: Média ponderada.");
		 
		 System.out.println("\nInsira o valor da primeira nota: ");
		 n1 = leia.nextFloat();
		 System.out.println("\nInsira o peso da primeira nota: ");
		 p1 = leia.nextFloat();
		 System.out.println("\nInsira o valor da segunda nota: ");
		 n2 = leia.nextFloat();
		 System.out.println("\nInsira o peso da segunda nota: ");
		 p2 = leia.nextFloat();
		 System.out.println("\nInsira o valor da terceira nota: ");
		 n3 = leia.nextFloat();
		 System.out.println("\nInsira o peso da terceira nota: ");
		 p3 = leia.nextFloat();
		 
		 media = (n1*p1 + n2*p2 + n3*p3)/(p1+p2+p3);
		 
		 System.out.printf("A média é: %.2f \n", media);

	}

}
