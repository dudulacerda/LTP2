package microEmpresaUML;

public abstract class Clientes extends Agentes{
	
	private static double totalClientes = 0;
	
	public Clientes(){
		
	}
	
	public Clientes(String nome, String endereco, String estado, String cidade, String cep, String telefone){
		super(nome, endereco, estado, cidade, cep, telefone);
		incrementaTotalClientes();

	}
	
	private static void incrementaTotalClientes(){
		setTotalClientes(getTotalClientes()+1);
	}
	
	public static void setTotalClientes(double totalClientes) {
		Clientes.totalClientes = totalClientes;
	}

	public static double getTotalClientes() {
		return totalClientes;
	}
}
