package gestaoEmprestimo;

import java.util.ArrayList;
import java.util.List;

public class RepositorioDevolucaoLista implements RepositorioDevolucao {

	private List <Devolucao> devolucoes;
	
	public RepositorioDevolucaoLista() {
		
		devolucoes = new ArrayList<Devolucao>();
	}

	@Override
	public void inserirD(Devolucao d) {
		devolucoes.add(d);
	}

	@Override
	public List<Devolucao> listarDevolucao() {
		return this.devolucoes;
	}

}
