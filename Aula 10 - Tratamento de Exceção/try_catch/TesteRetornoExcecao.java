package try_catch;
/* 
 Teste para verificar onde o código é interrompido na geração de uma exceção
*/

public class TesteRetornoExcecao {

	public static void main(String[] args) {
		TryDuplo();
		TrySimples();
	}
	
	// Duas exceções dentro do mesmo bloco TRY
	static void TryDuplo(){
		System.out.println("Método com Duas Intruções no TRY:");
		int x = 5;
		int[] v = {0,1,2,3};
		
		try{
			System.out.println(x/v[0]);			// A exceção gerada nesta linha bloqueia o resto do código dentro do TRY
			System.out.println(x/v[4]);							
		} catch (ArithmeticException e){
			System.out.println("- Erro Aritmético (1º Excecao)\n");
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("- Fora do Limite do Vetor (2º Excecao)\n");
		}
	}
	
	// Uma exceção é tratada em blocos TRY separados
	static void TrySimples(){
		System.out.println("Método com Uma Instrução no TRY:");
		int x = 4;
		int[] v = {0/1};
		
		try{
			System.out.println(x/v[0]);
		} catch (ArithmeticException e) {
			System.out.println("- Divisão por Zero (1º Excecao)");
		}
		
		try{
			System.out.println(x/v[2]);
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("- Indice Inexistente no Vetor (2º Excecao)");
		}	
	}
	/*
	 * Verifica-se que instruções dentro de um bloco TRY são executadas até ocorrer a primeira exceção
	 */
}

