
public class Teste {

	public static void main(String[] args) {
		Cliente c = new Cliente("Pedro de Lara", "888", "plara@bol.com.br");
		System.out.println(c.Nome);
		System.out.println(c.Cpf);
		System.out.println(c.Email);
		
		Cliente d = new Cliente();
		
		Cliente e = new Cliente("999");
		System.out.println(e.Nome + " " + e.Email);
	}
	
}
