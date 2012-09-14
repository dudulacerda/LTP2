package exerc04;

/*
 * 
 */

public class CompactDisc extends Produto{
	
	private String artista;
	private String gravadora;
	
	public CompactDisc(){}
	
	public CompactDisc(String codigo, String descricao, double preco, String artista, String gravadora){
		super(codigo,descricao,preco);			// super chama o construtor da superclasse, aproveitando c—digo
		this.setArtista(artista);
		this.setGravadora(gravadora);
	}
	
	public void mostraDados(){
		super.mostraDados();
		System.out.println("Artista: " + this.getArtista() );
		System.out.println("Gravadore: " + this.getGravadora() );
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getGravadora() {
		return gravadora;
	}

	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}
	
	
	
	

}
