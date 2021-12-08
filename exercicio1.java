package Projeto1Mod;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner entrada = new Scanner(System.in);
		 int idadeAnos, idadeMeses, idadeDias, idadeTotalDias;
		 
		 System.out.println("\nCalculadora de idade em dias: ");
		 
		 System.out.println("Digite os anos: ");
		    idadeAnos = entrada.nextInt();
		    
		 System.out.println("Digite os meses: ");
		    idadeMeses = entrada.nextInt();
		    
		 System.out.println("Digite os dias: ");
		    idadeDias = entrada.nextInt();
		    
		    idadeTotalDias  =  idadeAnos  *  365  +  idadeMeses  *  30  +  idadeDias ;
			System.out.println( "Idade total em dias = " + idadeTotalDias+" dias."); 
	}

}
