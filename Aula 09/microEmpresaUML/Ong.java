package microEmpresaUML;

public abstract class Ong extends Clientes {
	
	private String razaoSocial;
	private String cnpj;
	private static int quantidadeCadastradaONG;
	
	
	
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
	public static int getQuantidadeCadastradaONG() {
		return quantidadeCadastradaONG;
	}
	public static void setQuantidadeCadastradaONG(int quantidadeCadastradaONG) {
		Ong.quantidadeCadastradaONG = quantidadeCadastradaONG;
	}
	
	

}
