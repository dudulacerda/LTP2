package questao02;

public class Gato extends Animal {
	
	public Gato(){
		
	}
	
	public Gato(String nome){
		this.setNome(nome);
		System.out.print(this.getNome()+" ");
	}
	
	public void falar(){
		if (this.dormir() == false ){
			System.out.println("Miau ");
		} else {
			System.out.println("RRRR...RRRR...RRRR...");
		}
	}
	
	public void comer(){
		if (this.dormir() == false){
			System.out.println("Comendo...");
		} else {
			System.out.println("ZzZzZzZz...");
		}
	}

}
