package args;

public class MostraArgsPares {
	
	/* Chamo esse m�todo sem instanciar um Objeto
	 * Recebe uma String, converte para inteiro e imprimi os 
	 * n�meros pares
	 */
	
	public static void MostraArgs(String[] args){     
		System.out.print("Pares: ");
		for (int i=0; i<args.length; i++){
			int arg = Integer.parseInt(args[i]);
			if (arg % 2 == 0){
				System.out.print(" " + arg);
			}
		}
	}
}
