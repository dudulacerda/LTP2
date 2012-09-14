package exerc02;

public class PlanetaSistemaSolar {
	
	private String nome;
	private short qtdeLuas;
	private short duracaoDia;
	private short duracaoAno;
	private float temperaturaMedia;
	
	public PlanetaSistemaSolar(){}
	
	public PlanetaSistemaSolar(String nome){
		this.setNome(nome);
	}
	
	public PlanetaSistemaSolar(String nome, short qtdeLuas, short duracaoDia, 
								short duracaoAno, float temperaturaMedia){
		
		this.setNome(nome);
		this.setQtdeLuas(qtdeLuas);
		this.setDuracaoDia(duracaoDia);
		this.setDuracaoAno(duracaoAno);
		this.setTemperaturaMedia(temperaturaMedia);
	}
	
	public void exibirTodasInformacoes(){
		System.out.println("Nome: " + this.getNome());
		System.out.println("Qnt de Luas: " + this.getQtdeLuas());
		System.out.println("Durcao do Dia: " + this.getDuracaoDia());
		System.out.println("Duracao do Ano: " + this.getDuracaoAno());
		System.out.println("Temperatura Media: " + this.getTemperaturaMedia());
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public short getQtdeLuas() {
		return qtdeLuas;
	}

	public void setQtdeLuas(short qtdeLuas) {
		this.qtdeLuas = qtdeLuas;
	}

	public short getDuracaoDia() {
		return duracaoDia;
	}

	public void setDuracaoDia(short duracaoDia) {
		this.duracaoDia = duracaoDia;
	}

	public short getDuracaoAno() {
		return duracaoAno;
	}

	public void setDuracaoAno(short duracaoAno) {
		this.duracaoAno = duracaoAno;
	}

	public float getTemperaturaMedia() {
		return temperaturaMedia;
	}

	public void setTemperaturaMedia(float temperaturaMedia) {
		this.temperaturaMedia = temperaturaMedia;
	}
	
}
