package lab1;

public class ExcecaoTratada {

	/**
	 * Aqui é utilizado o TRY e CATCH para tratamento de exceções.
	 */
	public static void main(String[] args) {
		int i = 5;
		int x = 0;
		int r = 0;
		
		try {									// Ele tenta o código, caso não ocorra erro é executado
			r = i/x;
		} catch (Exception e){					   // Se houver erro executa o catch e/ou o que vier a seguir
			System.out.println(e.getMessage());    // irra imprimir o erro recebido pela exceção e
		}
									
		System.out.println("r = " + r);
	}

}
