package exerBanco;

public class ContaBancaria {
	
	private String cliente;
	private int num_conta;
	private float saldo;
	
	// construtores
	
	public ContaBancaria(){
		setCliente("");
		setNum_conta(0000);
		setSaldo(0000);
	}
	
	public ContaBancaria(String nome, int num_conta, float saldo){
		this.setCliente(nome);
		this.setNum_conta(num_conta);
		this.setSaldo(saldo);
	}
	
	//métodos
	
	public void sacar(float valorRetirada){
		if (saldo > valorRetirada){
			this.setSaldo(saldo - valorRetirada);
			System.out.println("Cliente: " + this.getCliente() + " - Valor retirado = " + valorRetirada);
		} else {
			System.out.println("Saldo Indisponível");
		}
	}
	
	public void depositar(float valorDeposito){
		this.setSaldo(saldo + valorDeposito);
	}

	public void mostraDados(){
		System.out.println("\nCliente: "+this.getCliente());
		System.out.println("Conta: "+this.getNum_conta());
		System.out.println("Saldo: "+this.getSaldo()+"\n");
	}
	
	
	// métodos get/set
	
	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public int getNum_conta() {
		return num_conta;
	}

	public void setNum_conta(int num_conta) {
		this.num_conta = num_conta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
}