
/* Instanciar três objetos da classe Pessoa 
 * e imprimir os atributos33
 */

public class Principal {
	public static void main(String[] args) {

		Pessoa Maria = new Pessoa(20,1.68,60);
		Pessoa Joao = new Pessoa(35,1.75,80);
		Pessoa Jose = new Pessoa(50,1.80,95);

		System.out.println("Maria ");
		Maria.showAtributos();

		System.out.println("Joao ");
		Joao.showAtributos();

		System.out.println("Jose ");
		Jose.showAtributos();

		Maria.toString();
	}

}
