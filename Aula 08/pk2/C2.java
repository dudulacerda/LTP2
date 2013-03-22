package pk2;

import pk1.C1;

public class C2 extends C1 {	
	
	void f(){
		System.out.println("C2");
	}

	public static void main(String[] args) {
		C1 c = new C2();
		c.f();
	}

}
