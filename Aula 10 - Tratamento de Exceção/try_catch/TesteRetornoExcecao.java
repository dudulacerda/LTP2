package try_catch;
/* 
 Teste para verificar onde o c�digo � interrompido na gera��o de uma exce��o
*/

public class TesteRetornoExcecao {

	public static void main(String[] args) {
		TryDuplo();
		TrySimples();
	}
	
	// Duas exce��es dentro do mesmo bloco TRY
	static void TryDuplo(){
		System.out.println("M�todo com Duas Intru��es no TRY:");
		int x = 5;
		int[] v = {0,1,2,3};
		
		try{
			System.out.println(x/v[0]);			// A exce��o gerada nesta linha bloqueia o resto do c�digo dentro do TRY
			System.out.println(x/v[4]);							
		} catch (ArithmeticException e){
			System.out.println("- Erro Aritm�tico (1� Excecao)\n");
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("- Fora do Limite do Vetor (2� Excecao)\n");
		}
	}
	
	// Uma exce��o � tratada em blocos TRY separados
	static void TrySimples(){
		System.out.println("M�todo com Uma Instru��o no TRY:");
		int x = 4;
		int[] v = {0/1};
		
		try{
			System.out.println(x/v[0]);
		} catch (ArithmeticException e) {
			System.out.println("- Divis�o por Zero (1� Excecao)");
		}
		
		try{
			System.out.println(x/v[2]);
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("- Indice Inexistente no Vetor (2� Excecao)");
		}	
	}
	/*
	 * Verifica-se que instru��es dentro de um bloco TRY s�o executadas at� ocorrer a primeira exce��o
	 */
}

