package Projeto1Mod;

public class exercicio_array_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int array_A[] = {1,0,5,-2,-5,7},soma,multiplicacao;
		
		System.out.println("vetor A: \n");
		
		for(int i = 0; i<6; i++) {
			System.out.printf("posicao %d \n\n", i , array_A[i]);
		}
        soma = array_A[0] + array_A[1] + array_A[5];
        array_A[4]=100;
        
        System.out.printf("soma é = %d\n", soma);

	}

}
