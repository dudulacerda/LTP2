package qualSaida;

public class TesteDoEscopo {

	/* Qual a sa’da do c—digo a seguir? Explique
	 * 
	 */
	public static void main(String[] args) {
		
		String primeiroValor = "Oi";
		
		if(true){
			String segundoValor = "Bye";
		}
		
		System.out.println(primeiroValor);
		//System.out.println(segundoValor);	
	}
	
	// segundo Valor Ž uma vari‡vel local do bloco if, n‹o existindo fora dele.

}
