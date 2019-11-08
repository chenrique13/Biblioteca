package gestaoProdutos;

public class Revista extends Acervo {

	private int edicao;
	private String nomeRevista;

	public Revista() {
	}

	public Revista(int codigo, int anoPublicacao, String volume, int numeroPaginas, int edicao, String nomeRevista) {
		super(codigo, anoPublicacao, volume, numeroPaginas);

		this.edicao = edicao;
		this.nomeRevista = nomeRevista;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public String getNomeRevista() {
		return nomeRevista;
	}

	public void setNomeRevista(String nomeRevista) {
		this.nomeRevista = nomeRevista;
	}

	@Override
	public String toString() {
		return "Revista [ Codigo da Revista = " + getCodigo() 
				+ ", Nome da Revista = " + nomeRevista 
				+ ", Edicao = "+ edicao 
				+ ", Ano de Publicacao = " + getAnoPublicacao() 
				+ ", Numero de Paginas = " + getNumeroPaginas() + "]\n";
	}
	
}
