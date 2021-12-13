package Projeto1Mod;

import java.util.Scanner;

public class exercicio_array_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
	
		  int[][] numero = new int[3][3];
		  int L, C, contagem=0;
		   
		    
		    for(L=0; L<3; L++)
		    {
		        for(C=0; C<3; C++)
		        {
		            System.out.printf("%dª linha, %dª coluna = ", L+1, C+1);
		            numero[L][C] = leia.nextInt();
		        }
		    }
		    for(int linha=0; linha<3; linha++)
		        for(int coluna=0; coluna<3; coluna++)
		            if(numero[linha][coluna] > 10) {
		                contagem++;
		 
		            }
		    System.out.printf("\n\n Existem na matriz %d números maiores que 10.", contagem);
		   
		}
	            }
	        
		


