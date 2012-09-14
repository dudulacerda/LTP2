package br.com.ltp2.www;

/*
 * 
 */

public class TesteAluno {

	public static void main(String[] args) {

		AlunoLtp2 Aluno01 = new AlunoLtp2();
		AlunoLtp2 Aluno02 = new AlunoLtp2("LTP2", 101010);
		
		Aluno01.nome = "Unifacs";
		Aluno02.matricula = 111111;
		
		System.out.println(Aluno01);
		System.out.println(Aluno02);
		
	}

}
