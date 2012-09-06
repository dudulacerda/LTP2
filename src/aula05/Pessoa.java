package aula05;

public class Pessoa {
	
	private int idade;
	private double altura;
	private int peso;


	public Pessoa() {}

	public Pessoa(int idade, double altura, int peso) {
		setIdade(idade);
		setAltura(altura);
		setPeso(peso);
	}

	public void showAtributos() {
		System.out.println("Idade: " + getIdade());
		System.out.println("Altura: " + getAltura());
		System.out.println("Peso: " + getPeso());
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
}
