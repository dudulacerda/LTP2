package lab1;

public class Excecao {

	/**
	 * Código para estudar tratamento de exceção, esse código apresenta um erro e não possui tratamento.
	 */
	public static void main(String[] args) {
		int i = 5;
		int x = 0;
		int r = 0;
		
		r = i/x;							//Erro: Divisão por zero, o programa é interrompido aqui.
		System.out.println("r = " + r);

	}

}
