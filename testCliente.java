package Projeto1Mod;

public class testCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println("\n----- CLIENTE -----");
		
		Cliente cliente = new Cliente(null, 0);
	
		Cliente cliente1 = new Cliente("Pedro",1234);
		System.out.println(cliente1.getInfo());
		cliente1.compra();
		
		

	}

}
