package args;

public class MostraArgsImpares {
	
	public static void MostraArgs(String[] args){
		System.out.print("Impares: ");
		for (int i=0; i<args.length; i++){
			int arg = Integer.parseInt(args[i]);
			if (arg % 2 != 0){
				System.out.print(" " + arg);
			}
		}
	}
}
