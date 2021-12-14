package Mod_Java;

public class TestFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n----- Funcionario -----");
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNomeFuncionario("\nMaria");
		funcionario.setSobrenomeF("Lima");
		funcionario.setFuncao("\nCaixa");
		
	
		System.out.println(funcionario.getNomeFuncionario());
		System.out.println(funcionario.getSobrenomeF());
		System.out.println(funcionario.getFuncao());
		
		

	}

}
