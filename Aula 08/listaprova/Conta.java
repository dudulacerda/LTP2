package listaprova;

public class Conta {
	
	private double saldo;
	private double limite;
	private Cliente titular;
	
	private double getSaldo(){
		return this.saldo + this.limite;
	}
	
	public Cliente getTitular(){
		return this.titular;
	}
	

}
