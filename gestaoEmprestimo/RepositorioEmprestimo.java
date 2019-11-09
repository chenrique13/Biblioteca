package gestaoEmprestimo;

import java.util.List;

public interface RepositorioEmprestimo {
	void inserir (Emprestimo e);
	void removerE(int numDevolucao);
	Emprestimo procurarE (int numEmprestimo);
	List <Emprestimo> listarEmprestimo();
}
