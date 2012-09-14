package exerc04;

/*
 * 
 */

public class Produto {

	private String codigo;
	private String descricao;
	private double preco;
	
	
	public Produto(){}
	
	public Produto(String codigo, String descricao, double preco){
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
	}
	
	public void mostraDados(){
		System.out.println("C—digo: " + this.getCodigo());
		System.out.println("Descricao: " + this.getDescricao());
		System.out.println("Preco: " + this.getPreco() );
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
