package Projeto1Mod;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner leia = new Scanner(System.in);
		
		int horas,segundos,minutos,minuto,tempo;
		String evento;
		
		System.out.println("Qual o nome do evento?:");
		evento = leia.next();
		System.out.println("Qual a duração em segundos do evento?:");
		tempo = leia.nextInt();
		
		horas = tempo/ 3600;
		minuto = tempo / 60;
		minutos = (tempo - (horas * 3600)) / 60;
		segundos = (tempo - (minutos * 60)) % 30;
		
		System.out.println("\nO evento "+evento+" terá a duração de "+horas+" horas, "+minutos+" minutos e "+segundos+" segundos.");
		System.out.println("\nO tempo total do evento"+evento+" em horas será de: "+horas+" horas.");
		System.out.println("\nO tempo total do evento"+evento+" em minutos será de: "+minuto+" minutos.");
		System.out.println("\nO tempo total do evento"+evento+" em segundos será de: "+tempo+" segundos.");



	}

}
