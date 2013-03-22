package lab1;

public class ExcecaoTratada {

	/**
	 * Aqui � utilizado o TRY e CATCH para tratamento de exce��es.
	 */
	public static void main(String[] args) {
		int i = 5;
		int x = 0;
		int r = 0;
		
		try {									// Ele tenta o c�digo, caso n�o ocorra erro � executado
			r = i/x;
		} catch (Exception e){					   // Se houver erro executa o catch e/ou o que vier a seguir
			System.out.println(e.getMessage());    // irra imprimir o erro recebido pela exce��o e
		}
									
		System.out.println("r = " + r);
	}

}
