package gestaoProdutos;

public abstract class Acervo {

	private int codigo;
	private int anoPublicacao;
	private String volume;
	private int numeroPaginas;

	public Acervo() {

	}

	public Acervo(int codigo, int anoPublicacao, String volume, int numeroPaginas) {
		this.codigo = codigo;
		this.anoPublicacao = anoPublicacao;
		this.volume = volume;
		this.numeroPaginas = numeroPaginas;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	@Override
	public String toString() {
		return "Acervo [Codigo = " + codigo + ", AnoPublicacao = " + anoPublicacao + ", Volume = " + volume
				+ ", Numero de Paginas=" + numeroPaginas + "]\n";
	}

}