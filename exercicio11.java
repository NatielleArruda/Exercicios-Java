package Projeto1Mod;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\nDigite sua Idade: ");
		idade = entrada.nextInt();
		
		  if(idade >= 10 && idade <= 15){
			    System.out.printf("Infantil A\n");
		    }
		    else if(idade >= 15 && idade <= 18){
		        System.out.printf("Infantil B\n");
		    }
		    else if(idade >= 18 && idade <= 25){
		    	System.out.printf("Juvenil A\n");
		    }
		    else if(idade >= 18){
		    	System.out.printf("Adulto\n");
		    }
		    else{
		    	System.out.printf("Sem categoria\n");
		    }
		}

	}

