package listaprova;
	
	/* Na constru‹o do objeto de uma classe filha, o construtor padr‹o de todas as super 
	 * classes s‹o executados, comeando pela mais super.
	 * Assim observar a sa’da do c—digo, que Ž diferente do "esperado".
	 */
public class D1 extends C1{
	
	public D1(){
		prim = "Argentina";
	}
	
	public D1(String n){
		prim = n;
	}
	
	public void m1(double nota){
		if(nota>=0.0 && nota<=10.0){
			pts = 0;
		}
	}
	
	public void m1 (int pt){
		if(pt>5){
			pts = 10;
		}
	}
	
	public void exibe(){
		System.out.println(pts);
	}
	
	
	public static void main(String[] args) {
		D1 d = new D1("Brasil");
		d.m1(5);
		d.exibe();
	}
}
