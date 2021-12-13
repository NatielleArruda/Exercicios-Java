package Projeto1Mod;

import java.util.Scanner;

public class exercicio_array_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		float[][] M1 = new float [2][2]; 
		float[][] M2 = new float [2][2];
		float[][] M3 = new float [2][2];
		
		int linha,coluna,op;
		float numM1,numM2;
		float num;
		
		for(linha=0;linha<2;linha++)
		{
			for(coluna=0;coluna<2;coluna++)
			{
				System.out.println("Digite os números da primeira matriz: ");
				M1[linha][coluna]=leia.nextFloat();
								
			}
		}
		for(linha=0;linha<2;linha++)
		{
			for(coluna=0;coluna<2;coluna++)
			{
				System.out.println("Digite os números da segunda matriz: ");
				M2[linha][coluna]= leia.nextFloat();
			}
		}
			
		System.out.println("\nAgora que informou os valores, escolha uma das opções abaixo: ");
		System.out.println("\n1 - Somar as duas matrizes.");
		System.out.println("\n2 - Subtrair a primeira matriz da segunda.");
		System.out.println("\n3 - Adicionar uma constante as duas matrizes.");
		System.out.println("\n4 - Imprimir as matrizes.");
		op=leia.nextInt();
		
		switch(op)
		{
			case 1:
				for(linha=0;linha<2;linha++)
				{
					for(coluna=0;coluna<2;coluna++)
					{
						M3[linha][coluna]=M1[linha][coluna]+M2[linha][coluna];
					}
				}
				System.out.println("\nA soma das duas matrizes é de: ");
				for(linha=0;linha<2;linha++)
				{
					for(coluna=0;coluna<2;coluna++)
					{
						System.out.println("\n"+M3[linha][coluna]);
					}
				}
				break;
				
			case 2:
				for(linha=0;linha<2;linha++)
				{
					for(coluna=0;coluna<2;coluna++)
					{
						M3[linha][coluna]=M1[linha][coluna]-M2[linha][coluna];	
					}
				}
				System.out.println("\nA subtração da primeira matriz para a segunda é: ");
				for(linha=0;linha<2;linha++)
				{
					for(coluna=0;coluna<2;coluna++)
					{
						System.out.println("\n"+M3[linha][coluna]);
					}
				}
				break;
			case 3:
				
				System.out.println("\nInforme uma constante a adicionar na primeira e segunda matriz: ");
				num=leia.nextFloat();
				
				for(linha=0;linha<2;linha++)
				{
					for(coluna=0;coluna<2;coluna++)
					{
						M1[linha][coluna]+=num;
			        	M2[linha][coluna]+=num;									
					}
				}			
				System.out.println("\nNovos valores MATRIZ 1");
				for(linha=0;linha<2;linha++)
				{
					for(coluna=0;coluna<2;coluna++)
					{
						System.out.println("\n"+M1[linha][coluna]);
					}
				}
				System.out.println("\nNovos valores MATRIZ 2");
				for(linha=0;linha<2;linha++)
				{
					for(coluna=0;coluna<2;coluna++)
					{
						System.out.println("\n"+M2[linha][coluna]);
					}
				}
				
				break;
				
			case 4:
				System.out.println("\nMATRIZ 1 ");
				for(linha=0;linha<2;linha++)
				{
					for(coluna=0;coluna<2;coluna++)
					{
						System.out.println("\n"+M1[linha][coluna]);
					}
				}
				System.out.println("\nMATRIZ 2 ");
				for(linha=0;linha<2;linha++)
				{
					for(coluna=0;coluna<2;coluna++)
					{
						System.out.println("\n"+M2[linha][coluna]);
					}
				}
	        	break;			
		}

	}

}
