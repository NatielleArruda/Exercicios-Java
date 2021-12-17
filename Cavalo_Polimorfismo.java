package Projeto1Mod;

public class Cavalo_Polimorfismo extends BaseAnimal_Polimorfismo implements Animal_Polimorfismo {

	Cavalo_Polimorfismo(String nome, String idade, String som, String caracteristica)
	{
		super(nome, idade, som, caracteristica);
		nomeClasse = "cavalo";
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
