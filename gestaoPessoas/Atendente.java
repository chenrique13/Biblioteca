package gestaoPessoas;

public class Atendente extends Pessoa {

	Integer identificador;
	String Senha;
	
	public Atendente () {
		
	}
	
	public Atendente(String nome, String cpf, String fone, String endereco, String cep, String email,
			Integer identificador) {
		super(nome, cpf, fone, endereco, cep, email);
		this.identificador = identificador;
	}

	public Integer getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}

	public String getSenha() {
		return Senha;
	}

	public void setSenha(String senha) {
		Senha = senha;
	}

}
