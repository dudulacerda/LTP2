package listaprova;

public class Manipula {

	private static int v1 = 1;
	public static int v2 = 2;
	private int v3 = 3;
	public int v4 = 4;
	
	public static void main(String[] args) {
		Manipula m = new Manipula();
		substitui();
		v1 = 5;
		m.v3 = 5;
		int v5 =m.trocavalor(v2,m.v4);
		System.out.println(v1 + "," + v2 + "," + m.v3 + "," + v5);

	}
	
	public static void substitui(){
		v2 = v1;
	}
	
	public int trocavalor(int par1, int par2){
		v1 = par1;
		v2 = par2++;
		v4 = v1 + v3;
		return v4;
	}

}
