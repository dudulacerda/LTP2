package listaprova;

public class C1 {
	
	String prim;
	int pts = 0;
	
	public C1(String n){
		if(prim=="Brasil"){
			pts += 50;
		} else {
			pts +=30;
		}
	}
	
	public C1(){
		if(prim=="Argentina")
			pts = 100;
		else
			pts = 200;
	}
	
	public void exibe(){
		System.out.println(pts+20);
	}

}
