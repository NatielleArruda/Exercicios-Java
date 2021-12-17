package Projeto1Mod;

public class Cachorro_Polimorfismo extends BaseAnimal_Polimorfismo implements Animal_Polimorfismo  {

	Cachorro_Polimorfismo(String nome, String idade, String som, String caracteristica)
	{
		super(nome, idade, som, caracteristica);
		nomeClasse = "cachorro";
	}
	
	@Override
	public String getNome(){
		return nome;
	}
	public String getIdade() {
		return idade;
	}
	public String getSom() {
		return som;
	}
	public String getCaracteristica() {
		return caracteristica;
	}

}
