package gestaoProdutos;

public class Livro extends Acervo {

	private Integer codigoAutor;
	private String nomeAutor;
	private String titulo;
	private String editora;
	private String isbn;
	private int edicao;

	public Livro() {
	}

	public Livro(int codigo, int anoPublicacao, String volume, int numeroPaginas, Integer codigoAutor,
			String nomeAutor, String titulo, String editora, String isbn, int edicao) {
		super(codigo, anoPublicacao, volume, numeroPaginas);
		this.codigoAutor = codigoAutor;
		this.nomeAutor = nomeAutor;
		this.titulo = titulo;
		this.editora = editora;
		this.isbn = isbn;
		this.edicao = edicao;
	}

	public Integer getCodigoAutor() {
		return codigoAutor;
	}

	public void setCodigoAutor(Integer codigoAutor) {
		this.codigoAutor = codigoAutor;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	@Override
	public String toString() {
		return "Livro [ Codigo do Livro = " + getCodigo() 
				+ ", Titulo do Livro = " + titulo 
				+ ", Nome do Autor = "+ nomeAutor 
				+ ", AnoPublicacao = " + getAnoPublicacao() 
				+ ", Volume = " + getVolume() + "]\n";
	}

}
