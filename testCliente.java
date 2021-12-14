package Mod_Java;

public class testCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println("\n----- CLIENTE -----");
		
		Cliente cliente = new Cliente();
		
		cliente.setNome("Pedro");
		cliente.setIdade("20");
		cliente.setTelefone("912222222");
		cliente.setEndereco("Rua Guanabara");
		
	
		System.out.println(cliente.getNome());
		System.out.println(cliente.getIdade());
		System.out.println(cliente.getTelefone());
		System.out.println(cliente.getEndereco());
		

	}

}
