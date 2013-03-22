package microEmpresaUML;

public abstract class Agentes {
	
	private String nome;
	private String endereco;
	private String estado;
	private String cidade;
	private String cep;
	private String telefone;
	private boolean status;
	
	public Agentes(){
		
	}
	
	public Agentes (String nome, String endereco, String estado, String cidade, String cep, String telefone){
		setNome(nome);
		setEndereco(endereco);
		setEstado(estado);
		setCidade(cidade);
		setCep(cep);
		setTelefone(telefone);
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	

}
