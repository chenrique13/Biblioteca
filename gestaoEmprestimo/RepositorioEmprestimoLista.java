package gestaoEmprestimo;

import java.util.ArrayList;
import java.util.List;

public class RepositorioEmprestimoLista implements RepositorioEmprestimo {

	private List<Emprestimo> emprestimos;

	public RepositorioEmprestimoLista() {
		emprestimos = new ArrayList<Emprestimo>();
	}

	@Override
	public void inserir(Emprestimo e) {
		emprestimos.add(e);
	}

	@Override
	public void removerE(int numDevolucao) {
		int posicao = -1;
		for (Emprestimo emprestimo : emprestimos) {
			if ( emprestimo.getId() == numDevolucao) {
				posicao = emprestimos.indexOf(emprestimo);
				break;
			}
		}

		if (posicao != -1) {
			emprestimos.remove(posicao);
		}
	}

	@Override
	public List<Emprestimo> listarEmprestimo() {
		return this.emprestimos;
	}

	@Override
	public Emprestimo procurarE(int numEmprestimo) {
		Emprestimo procurada = null;
		for (Emprestimo emprestimo : emprestimos) {
			if (emprestimo.getId() == numEmprestimo) {
				procurada = emprestimo;
			}
		}
		return procurada;
	}

}
