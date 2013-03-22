package microEmpresaUML;

public class TestaClientes {

	public static void main(String[] args) {
		
		ClientePadrao cliente01 = new ClientePadrao("Eduardo","Pituba","Bahia","Salvador","410000","3333-3333","000.0000-081",true,"Refeicao");
		
		System.out.println(PessoaFisica.getTotalClientes());
		

	}

}
