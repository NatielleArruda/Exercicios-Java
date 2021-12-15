package Projeto1Mod;

public class Cachorro extends Animal1{
	
	public Cachorro(String nome, String som, int idade) {
		super(nome, som, idade);
		// TODO Auto-generated constructor stub
	}

	private boolean correr;

public boolean isCorrer() {
	return correr;
}

public void setCorrer(boolean correr) {
	this.correr = correr;
}

public void imprimirInfo()
{
	System.out.println("\n--- > Dados do Cachorro < ---\nNome: "+getNome()+"\nIdade: "+getIdade()+"\nSom: "+getSom());
}

public void imprimirMovimento()
{
	if(isCorrer()==true) 
	{
		System.out.println("\nGosta de correr!!");
	}
}
	
}
