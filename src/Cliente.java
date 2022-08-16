
public class Cliente {
//Construir com atributos nulos
	
//Construir com valores para os atributos
	
		
	
	public String Nome;
	public String Cpf;
	public String Email;
	
	//Sobrecarga
	Cliente() {		
	}
	
	//Construtor
	Cliente(String Nome, String Cpf, String Email){
		this.Nome = Nome;
		this.Cpf = Cpf;
		this.Email = Email;
	}
	
//Construir a partir do CPF = consultar o banco de dados
	
	Cliente(String Cpf) {
		this.Cpf = Cpf;
		if (Cpf == "999") {
			this.Nome = "Araci de Almeida";
			this.Email = "araci@gmail.com";
		}
		System.out.println("Consultando o Banco de Dados");
	}
	
}
