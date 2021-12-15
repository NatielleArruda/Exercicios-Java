package Projeto1Mod;

import java.util.Scanner;

public class Cliente {
	
	Scanner ler = new Scanner (System.in);
	double vp,vt; 
	
	private String nome;
	private int codigo;
	
	public Cliente(String nome,int codigo)
	{
		this.nome = nome;
		this.codigo = codigo;
	}
	
	public Scanner getLer()
	{
		return ler;
	}
	
	public void setLer(Scanner ler)
	{
		this.ler = ler;
	}

	public double getVp() {
		return vp;
	}

	public void setVp(double vp) {
		this.vp = vp;
	}

	public double getVt() {
		return vt;
	}

	public void setVt(double vt) {
		this.vt = vt;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public double valor(double vt)
	{
		System.out.println("\nO valor de cada produto deve ser inserido"
				+" individualmente\nPara finalizar entre com 0 ou número negativo");
		do
		{
			System.out.println("\nEntre com o valor: ");
			vp = ler.nextDouble();
			vt = vt+vp;
		}while(vp>0);
		return vt;
	}
	
	public String getInfo()
	{
		String info = nome + "\t\t" + codigo;
		return info;
	}
	
	public void compra()
	{
		System.out.printf("\nTotal: %.2f",valor(0.0));
	}
	

}
