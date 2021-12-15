package Projeto1Mod;

public class Preguica {
	public class preguica extends Animal1 {
		
		private boolean subirArvore;
		
		public preguica (String nome, String som, int idade, boolean subirArvore)
		{
			super(nome,som,idade);
			this.subirArvore=subirArvore;
		}

		public boolean isSubirArvore() {
			return subirArvore;
		}

		public void setSubirArvore(boolean subirArvore) {
			this.subirArvore = subirArvore;
		}
		public void imprimirInfo()
		{
			System.out.println("\n--- > Dados da Preguiça < ---\nNome: "+getNome()+"\nIdade: "+getIdade()+"\nSom: "+getSom());
		}
		public void imprimirMovimento()
		{
			if(isSubirArvore()==true) 
			{
				System.out.println("\nGosta de Subir Árvores!!");
			}
		}

	}

	public Preguica(String string, String string2, int i) {
		// TODO Auto-generated constructor stub
	}

	public void imprimirMovimento() {
		// TODO Auto-generated method stub
		
	}

	
	
}
