package gestaoEmprestimo;

import java.text.Format;
import java.text.SimpleDateFormat;

public class EmprestimoLivro extends Emprestimo {
	
	Format data = new SimpleDateFormat("dd/MM/yyyy");
	
	@Override
	public String toString() {
		return "Emprestimo [Numero do emprestimo = " + getId() 
		+ ", Matricula do Usuario = " + getUsuario().getMatricula() 
		+ ", Nome do usuario = " + getUsuario().getNome() 
		+ ", Codigo do livro = " + getLivro().getCodigo() 
		+ ", Nome do livro = " + getLivro().getTitulo() 
		+ ", Data do emprestimo = "+ data.format( getDataEmprestimo()) +"]\n";
	}

}
