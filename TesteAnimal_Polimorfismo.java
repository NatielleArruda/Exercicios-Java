package Projeto1Mod;

public class TesteAnimal_Polimorfismo {

	public static void main(String[] args) {
		
		Cachorro_Polimorfismo animal1 = new Cachorro_Polimorfismo("Speed","4","latir","correr");
		Cavalo_Polimorfismo animal2 = new Cavalo_Polimorfismo("P� de Pano","10","relinchar","correr");
		Preguica_Polimorfismo animal3 = new Preguica_Polimorfismo("Florentina","3","guinchar","subir em �rvores");
		
		System.out.println("\nColetando dados dos animais...");
		System.out.println("\nO animal �: "+animal1.getNomeClasse()+"\nO nome �: "+animal1.getNome()+"\nCom a idade de: "+animal1.getIdade()+" anos\nO som que o animal emite �: "+animal1.getSom()+"\nE sua caracter�stica �: "+animal1.getCaracteristica());
		System.out.println("\nO animal �: "+animal2.getNomeClasse()+"\nO nome �: "+animal2.getNome()+"\nCom a idade de: "+animal2.getIdade()+" anos\nO som que o animal emite �: "+animal2.getSom()+"\nE sua caracter�stica �: "+animal2.getCaracteristica());
		System.out.println("\nO animal �: "+animal3.getNomeClasse()+"\nO nome �: "+animal3.getNome()+"\nCom a idade de: "+animal3.getIdade()+" anos\nO som que o animal emite �: "+animal3.getSom()+"\nE sua caracter�stica �: "+animal3.getCaracteristica());
		System.out.println("\nTodos os dados foram exibidos.");

	}

}
