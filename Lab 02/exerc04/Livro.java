package exerc04;

/*
 * 
 */

public class Livro extends Produto {
	
	private String autor;
	private String ISBN;
	
	public Livro(){}
	
	public Livro(String codigo, String descricao, double preco, String autor, String ISBN){
		super(codigo,descricao,preco);
		this.setAutor(autor);
		this.setISBN(ISBN);
	}
	
	public void mostraDados(){
		super.mostraDados();
		System.out.println("Autor: " + this.getAutor() );
		System.out.println("ISBN: " + this.getISBN() + "\n\n");
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	
	

}
