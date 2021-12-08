package Projeto1Mod;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		double x1,x2,y1,y2, d;
		
		System.out.println("\nCalcular Distância entre 2 Pontos");
		
		System.out.println("\nQual o valor de x1? ");
		x1 = leia.nextDouble();
		System.out.println("\nQual o valor de x2? ");
		x2 = leia.nextDouble();
		System.out.println("\nQual o valor de y1? ");
		y1 = leia.nextDouble();
		System.out.println("\nQual o valor de y2? ");
		y2 = leia.nextDouble();
		
		d = (((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
		
		System.out.printf("\na distância entre eles é: %2.2f", d);		

	}

}
