package microEmpresaUML;

public abstract class PessoaFisica extends Clientes {
	
	private String cpf;
	private static double quantidadeCadastradaPF;
	
	public PessoaFisica(){
		incrementaQuantidade();
	}
	
	public PessoaFisica(String nome, String endereco, String estado, String cidade, String cep, String telefone, String cpf){
		super(nome, endereco, estado, cidade, cep, telefone);
		setCpf(cpf);
		incrementaQuantidade();
	}
	
	private static void incrementaQuantidade(){
		setQuantidadeCadastradaPF(quantidadeCadastradaPF + 1);
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public static double getQuantidadeCadastradaPF() {
		return quantidadeCadastradaPF;
	}
	public static void setQuantidadeCadastradaPF(double quantidadeCadastradaPF) {
		PessoaFisica.quantidadeCadastradaPF = quantidadeCadastradaPF;
	}
	
	

}
