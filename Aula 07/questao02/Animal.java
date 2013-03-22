package questao02;

import java.util.Random;

public abstract class Animal {
	
	private String nome;
	private char sexo;
	
	public Animal(){
		
	}
	
	public abstract void falar();
	
	public abstract void comer();
	
	public boolean dormir(){

		Random num = new Random();
		
		if (num.nextInt(10) % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
}
