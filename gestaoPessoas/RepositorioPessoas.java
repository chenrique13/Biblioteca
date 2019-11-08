package gestaoPessoas;

import java.util.List;

public interface RepositorioPessoas {

	void inserir (Usuario u);
	void removerU(String numUsuario);
	Usuario procurarU (String numUsuario);
	List <Usuario> listarUsuarios();
}
