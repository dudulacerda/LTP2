package lab1;

public class Excecao {

	/**
	 * C�digo para estudar tratamento de exce��o, esse c�digo apresenta um erro e n�o possui tratamento.
	 */
	public static void main(String[] args) {
		int i = 5;
		int x = 0;
		int r = 0;
		
		r = i/x;							//Erro: Divis�o por zero, o programa � interrompido aqui.
		System.out.println("r = " + r);

	}

}
