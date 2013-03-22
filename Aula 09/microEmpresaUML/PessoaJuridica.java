package microEmpresaUML;

public abstract class PessoaJuridica extends Clientes {
	
	private String razaoSocial;
	private String cnpj;
	private static double quantidadeCadastradaPJ;
	
	public PessoaJuridica(){
		
	}
	
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public static double getQuantidadeCadastradaPJ() {
		return quantidadeCadastradaPJ;
	}
	public static void setQuantidadeCadastradaPJ(double quantidadeCadastradaPJ) {
		PessoaJuridica.quantidadeCadastradaPJ = quantidadeCadastradaPJ;
	}
	
	

}
