package gestaoProdutos;

import java.util.ArrayList;
import java.util.List;

public class RepositorioProdutosLista implements RepositorioProdutos {

	private List <Livro> livros;
	private List <Revista> revistas;
	private List <Jornal> jornais;

	public RepositorioProdutosLista() {

		livros = new ArrayList<Livro>();
		revistas = new ArrayList<Revista>();
		jornais = new ArrayList<Jornal>();
	}

	@Override
	public void inserir(Livro a) {
		livros.add(a);
	}

	@Override
	public void inserir(Revista r) {
		revistas.add(r);
	}

	@Override
	public void inserir(Jornal j) {
		jornais.add(j);
	}

	@Override
	public List<Livro> listarLivro() {

		return this.livros;
	}

	@Override
	public List<Revista> listarRevista() {

		return this.revistas;
	}

	@Override
	public List<Jornal> listarJornal() {

		return this.jornais;
	}

	@Override
	public void removerL(int numLivro) {
		int posicao = -1;
		for (Livro livro : livros) {
			if ( livro.getCodigo() == numLivro) {
				posicao = livros.indexOf(livro);
				break;
			}
		}

		if (posicao != -1) {
			livros.remove(posicao);
		}
	}

	@Override
	public void removerR(int numRevista) {
		int posicao = -1;
		for (Revista revista : revistas) {
			if (revista.getCodigo() == numRevista) {
				posicao = revistas.indexOf(revista);
				break;
			}
		}

		if (posicao != -1) {
			revistas.remove(posicao);
		}
	}

	@Override
	public void removerJ(int numJornal) {
		int posicao = -1;
		for (Jornal jornal : jornais) {
			if (jornal.getCodigo() == numJornal) {
				posicao = jornais.indexOf(jornal);
				break;
			}
		}

		if (posicao != -1) {
			jornais.remove(posicao);
		}
	}

	@Override
	public Livro procurarL(int numLivro) {
		Livro procurada = null;
		for (Livro livro : livros) {
			if (livro.getCodigo() == numLivro) {
				procurada = livro;
			}
		}
		return procurada;
	}

	@Override
	public Revista procurarR(int numRevista) {
		Revista procurada = null;
		for (Revista revista : revistas) {
			if (revista.getCodigo() == numRevista) {
				procurada = revista;
			}
		}
		return procurada;
	}

	@Override
	public Jornal procurarJ(int numJornal) {
		Jornal procurada = null;
		for (Jornal jornal : jornais) {
			if (jornal.getCodigo() == numJornal) {
				procurada = jornal;
			}
		}
		return procurada;
	}
}
