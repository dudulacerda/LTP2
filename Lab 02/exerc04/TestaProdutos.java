package exerc04;

/*
 * 
 */

public class TestaProdutos {
	
	public static void main(String Args[]){
		
		Livro livro01 = new Livro("101","Independencia ou Mortos",49.00,"Fabio Yabu","43245");
		
		CompactDisc cd01 = new CompactDisc("301","Nickelback",19.00,"Nickelback","EMI");
		
		livro01.mostraDados();
		cd01.mostraDados();
		
	}
	

}
