package gestaoProdutos;

public class Jornal extends Acervo {

	private String nomeJornal;

	public Jornal() {

	}

	public Jornal(int codigo, int anoPublicacao, String volume, int numeroPaginas, String nomeJornal) {
		super(codigo, anoPublicacao, volume, numeroPaginas);
		this.nomeJornal = nomeJornal;
	}

	public String getNomeJornal() {
		return nomeJornal;
	}

	public void setNomeJornal(String nomeJornal) {
		this.nomeJornal = nomeJornal;
	}

	@Override
	public String toString() {
		return "Jornal [ Codigo do Jornal = " + getCodigo() 
				+ ", Nome do Jornal = " + nomeJornal
				+ ", Ano de Publicacao = " + getAnoPublicacao()
				+ ", Numero de Paginas = " + getNumeroPaginas() + "]\n";
	}

}
