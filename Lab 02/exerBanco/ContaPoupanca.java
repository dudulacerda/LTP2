package exerBanco;

public class ContaPoupanca extends ContaBancaria{
	
	private int diaDeRendimento;
	
	// construtores
	
	public ContaPoupanca(){
		super();
	}
	
	public ContaPoupanca(String nome,int num_conta,float saldo){
		super(nome,num_conta,saldo);	
	}
	
	
	// métodos
	
	public void calcularNovoSaldo(float txRendimento){
		super.setSaldo((this.getSaldo() + (this.getSaldo()*(txRendimento/100))));
		System.out.println("Cliente: "+this.getCliente()+" - Seu novo saldo = " + this.getSaldo());
	}
	
	
	// métodos Get/Set

	public int getDiaDeRendimento() {
		return diaDeRendimento;
	}

	public void setDiaDeRendimento(int diaDeRendimento) {
		this.diaDeRendimento = diaDeRendimento;
	}
	
	
}
