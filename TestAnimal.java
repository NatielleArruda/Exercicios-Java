package Projeto1Mod;

public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro cachorro1  = new Cachorro("Speddy","AU AU AU!",61);
		Cavalo cavalo1= new Cavalo("Maximus","IHIHIHIHHIHI!!",22);
		Preguica preguica1= new Preguica("Matilda","zzzZzzzZzzz",10);
		
		cachorro1.imprimirInfo();
		cachorro1.imprimirMovimento();
		
		cavalo1.imprimirInfo();
		cavalo1.imprimirMovimento();
		
		preguica1.imprimirMovimento();
		preguica1.imprimirMovimento();

	}
	
}
