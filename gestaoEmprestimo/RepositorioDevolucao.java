package gestaoEmprestimo;

import java.util.List;

public interface RepositorioDevolucao {
	
	void inserirD (Devolucao e);
	List <Devolucao> listarDevolucao();
}
