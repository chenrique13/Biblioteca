package gestaoProdutos;

import java.util.List;

public interface RepositorioProdutos {

	void inserir(Livro a);
	void inserir(Revista r);
	void inserir(Jornal j);
	
	void removerL(int numLivro);
	void removerR(int numRevista);
	void removerJ(int numJornal);

	Livro procurarL(int numLivro);
	Revista procurarR(int numRevista);
	Jornal procurarJ(int numJornal);

	List<Livro> listarLivro();
	List<Revista> listarRevista();
	List<Jornal> listarJornal();
}
