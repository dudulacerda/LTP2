package br.com.ltp2.www;

/*
 * 
 */

public class AlunoLtp2 {
	
	protected String nome;
	protected int matricula; 
	
	public AlunoLtp2() { }
	
	public AlunoLtp2(String nome, int matricula){
	
		this.setNome(nome);
		this.setMatricula(matricula); 
	}
	
	public String toString(){
		return "Nome: "+ nome +" / Matricula: " + matricula;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

}
