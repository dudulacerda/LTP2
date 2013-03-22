package questao02;

public class Cachorro extends Animal{
	
	public Cachorro(){
		
	}
	
	public Cachorro(String nome){
		this.setNome(nome);
		System.out.print(this.getNome()+" ");	
	}
	
	public void falar(){
		if (this.dormir() == false){
			System.out.println("Latir ");
		} else {
			System.out.println("RRRR...RRRR...RRRR...");
		}
	}
	
	public void comer(){
		if (this.dormir() == false){
			System.out.println("Comendo!");
		} else {
			System.out.println("ZzZzZzZ....");
		}
	}
	
	

}
