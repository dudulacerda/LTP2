package lab1;

public class ExcecaoTratadaFinally {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 5;
		int x = 0;
		int r = 0;
		
		try {									
			r = i/x;
		} catch (Exception e){					   
			System.out.println(e.getMessage());    
		} finally {									
			System.out.println("Sempre Executado!");		// O bloco finally semrpe será executado independente da exceção
		}
									
		System.out.println("r = " + r);

	}

}
