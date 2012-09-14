package exerBanco;

public class ContaEspecial extends ContaBancaria {
	
	private float limite;
	
	// construtores
	
	public ContaEspecial(){
		super();
		setLimite(0);
	}
	
	public ContaEspecial(String nome,int conta,float saldo,float limite){
		super(nome,conta,saldo);
		setLimite(limite);
		
	}
	
	// métodos
	
	public void sacar(float valorRetirado){
		if (-(this.getSaldo()-valorRetirado) <= this.limite){
			this.setSaldo(this.getSaldo()-valorRetirado);
			System.out.println("Cliente: "+this.getCliente() +" - Valor Retirado = "+valorRetirado);
		} else {
			System.out.println("Cliente: "+this.getCliente() +" - ERRO: Seu Limite está estourado!");
		}	
	}

	// métodos Get/Set
	
	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	
}	


