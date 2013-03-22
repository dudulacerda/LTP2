package listaprova;

public class Testing {

	private static int i = 0;
	
	public static void go(){
		System.out.println(i++);
	}
	
	public static void main(String[] args) {
		new Testing().go();
		new Testing().go();
		new Testing().go();
		new Testing().go();
		new TestingIntern().run();
	}
	
	public void go2(){
		new TestingIntern().run();
	}
	
	public class TestingIntern(){
		public void run(){
			System.out.println(i++);
		}
	}
}
