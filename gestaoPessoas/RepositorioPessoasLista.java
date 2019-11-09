package gestaoPessoas;

import java.util.ArrayList;
import java.util.List;

public class RepositorioPessoasLista implements RepositorioPessoas {

	private List<Usuario> usuarios;

	public RepositorioPessoasLista() {
		usuarios = new ArrayList<Usuario>();
	}

	@Override
	public void inserir(Usuario u) {
		usuarios.add(u);
	}

	@Override
	public void removerU(String numUsuario) {
		int posicao = -1;
		for (Usuario usuario : usuarios) {
			if (usuario.getMatricula().contentEquals(numUsuario)) {
				posicao = usuarios.indexOf(usuario);
				break;
			}
		}

		if (posicao != -1) {
			usuarios.remove(posicao);
		}

	}

	@Override
	public Usuario procurarU(String numUsuario) {
		Usuario procurada = null;
		for (Usuario usuario : usuarios) {
			if (usuario.getMatricula().contentEquals(numUsuario)) {
				procurada = usuario;
			}
		}
		return procurada;
	}

	@Override
	public List<Usuario> listarUsuarios() {

		return this.usuarios;
	}
}

