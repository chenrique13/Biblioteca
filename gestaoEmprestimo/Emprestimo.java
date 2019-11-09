package gestaoEmprestimo;

import java.util.Date;

import gestaoPessoas.Usuario;
import gestaoProdutos.Jornal;
import gestaoProdutos.Livro;
import gestaoProdutos.Revista;

public abstract class Emprestimo {

	private Usuario usuario;
	private Livro livro;
	private Jornal jornal;
	private Revista revista;
	private int id;
	private Date dataEmprestimo;
	private String status;

	public Emprestimo() {

	}

	public Emprestimo(Usuario usuario, Livro livro, Jornal jornal, Revista revista,int id, Date dataEmprestimo,
			String status) {
		this.usuario = usuario;
		this.livro = livro;
		this.jornal = jornal;
		this.revista = revista;
		this.id = id;
		this.dataEmprestimo = dataEmprestimo;
		this.status = status;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Jornal getJornal() {
		return jornal;
	}

	public void setJornal(Jornal jornal) {
		this.jornal = jornal;
	}

	public Revista getRevista() {
		return revista;
	}

	public void setRevista(Revista revista) {
		this.revista = revista;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
		
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
