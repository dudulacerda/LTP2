package usandoScanner;

import java.util.Scanner;

public class RestodaDivisao {

	/* Ler dois n�meros atrav�s da instancia��o do objeto teclado da classe Scanner
	 * mostra o resto inteiro da divis�o entre os dois n�meros, usando cast expl�cito!
	 */
	
	static float x;
	static float y;
	
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite 1� N�mero: ");
		x = teclado.nextFloat();
		
		System.out.println("Digite 2� N�mero: ");
		y = teclado.nextFloat();
		
		System.out.println("Resto Inteiro da Divis�o = " + (int)(x/y));
		
	}

}
