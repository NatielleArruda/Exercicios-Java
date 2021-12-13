package Projeto1Mod;

import java.util.Scanner;

public class exercicio_array_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int[] num = new int [6];
		
        int numero, contPar = 0, contImpar = 0, soma;
        
        for(int i = 1; i <= 5; i++){
            System.out.println("Digite o " + i + "º número");
            numero = leia.nextInt();
            
            if(numero % 2 == 0){
                contPar++;
            }
            
            if(numero % 2 == 1){
                contImpar++;
            }
            
        }
        
        System.out.println("Foram digitados " + contPar + " números pares ");
         System.out.println("E " + contImpar + " números ímpares. ");
		

	}

}
