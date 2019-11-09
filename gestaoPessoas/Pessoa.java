package gestaoPessoas;

public abstract class Pessoa {

	private String nome;
	private String cpf;
	private String fone;
	private String endereco;
	private String cep;
	private String email;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String cpf, String fone, String endereco, String cep, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.fone = fone;
		this.endereco = endereco;
		this.cep = cep;
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}

