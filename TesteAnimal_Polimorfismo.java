package Projeto1Mod;

public class TesteAnimal_Polimorfismo {

	public static void main(String[] args) {
		
		Cachorro_Polimorfismo animal1 = new Cachorro_Polimorfismo("Speed","4","latir","correr");
		Cavalo_Polimorfismo animal2 = new Cavalo_Polimorfismo("Pé de Pano","10","relinchar","correr");
		Preguica_Polimorfismo animal3 = new Preguica_Polimorfismo("Florentina","3","guinchar","subir em árvores");
		
		System.out.println("\nColetando dados dos animais...");
		System.out.println("\nO animal é: "+animal1.getNomeClasse()+"\nO nome é: "+animal1.getNome()+"\nCom a idade de: "+animal1.getIdade()+" anos\nO som que o animal emite é: "+animal1.getSom()+"\nE sua característica é: "+animal1.getCaracteristica());
		System.out.println("\nO animal é: "+animal2.getNomeClasse()+"\nO nome é: "+animal2.getNome()+"\nCom a idade de: "+animal2.getIdade()+" anos\nO som que o animal emite é: "+animal2.getSom()+"\nE sua característica é: "+animal2.getCaracteristica());
		System.out.println("\nO animal é: "+animal3.getNomeClasse()+"\nO nome é: "+animal3.getNome()+"\nCom a idade de: "+animal3.getIdade()+" anos\nO som que o animal emite é: "+animal3.getSom()+"\nE sua característica é: "+animal3.getCaracteristica());
		System.out.println("\nTodos os dados foram exibidos.");

	}

}
