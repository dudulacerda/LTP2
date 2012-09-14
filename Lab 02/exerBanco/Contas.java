package exerBanco;


/* passos no arquivo exercicio objetos Banco 
 *
 */

public class Contas {

	public static void main(String[] args) {
		
		ContaPoupanca conta01 = new ContaPoupanca("Eduardo",0001,4000);
		
		conta01.sacar(3000);
		
		ContaEspecial conta02 = new ContaEspecial("Junior",0002,2000,2000);
		
		conta02.sacar(3000);
		
		conta01.depositar(2000);
		conta02.depositar(1000);
		
		conta01.calcularNovoSaldo(20);
		
		conta01.mostraDados();
		conta02.mostraDados();
	}

}
