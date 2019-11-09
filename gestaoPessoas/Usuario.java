package gestaoPessoas;

public class Usuario extends Pessoa{

	private String matricula;
	private String curso;
	
	public Usuario() {
		
	}
	
	public Usuario(String nome, String cpf, String fone, String endereco, String cep, String email, String matricula,
			String curso) {
		super(nome, cpf, fone, endereco, cep, email);
		this.matricula = matricula;
		this.curso = curso;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Usuario [Matricula = " +  matricula 
				+ ", Nome = " + getNome() 
				+ ", Fone = "  + getFone() 
				+ ", Curso = " + curso +  "]\n";
	}
		
}

