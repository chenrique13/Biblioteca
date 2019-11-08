package gestaoPessoas;

import gestaoProdutos.Jornal;
import gestaoProdutos.Livro;
import gestaoProdutos.Revista;

public class Banco {

	public Banco() {
		Livro l = new Livro();
		l.setCodigo(1);
		l.setTitulo("Portugues");
//		repLivros.inserir(l);

		Revista r = new Revista();
		r.setCodigo(2);
		r.setNomeRevista("Veja");
//		repRevistas.inserir(r);

		Jornal j = new Jornal();
		j.setCodigo(3);
		j.setNomeJornal("DiarioPE");
//		repJornais.inserir(j);

		Usuario u = new Usuario();
		u.setMatricula("123");
		u.setNome("Carlos");
//		repUsuario.inserir(u);
	}

}
