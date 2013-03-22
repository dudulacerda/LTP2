package microEmpresaUML;

public class ClientePadrao extends PessoaFisica{
	
	private boolean possuiTicket;
	private String tipoTicket;
	
	public ClientePadrao(String nome, String endereco, String estado, String cidade, String cep, String telefone, String cpf,
			boolean possuiTicket, String tipoTicket){
		super(nome, endereco, estado, cidade, cep, telefone, cpf);
	}
		
	public boolean isPossuiTicket() {
		return possuiTicket;
	}
	public void setPossuiTicket(boolean possuiTicket) {
		this.possuiTicket = possuiTicket;
	}
	public String getTipoTicket() {
		return tipoTicket;
	}
	public void setTipoTicket(String tipoTicket) {
		this.tipoTicket = tipoTicket;
	}
	
	

}
