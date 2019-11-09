package gestaoEmprestimo;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Devolucao{
	
	private Emprestimo emprestimo;
	private Date devolucao;
	private double multa;
	
	Format data = new SimpleDateFormat("dd/MM/yyyy");
	
	public Devolucao () {
		
	}

	public Devolucao(Emprestimo emprestimo, Date devolucao, double multa) {
		super();
		this.emprestimo = emprestimo;
		this.devolucao = devolucao;
		this.multa = multa;
	}

	public Emprestimo getEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(Emprestimo emprestimo) {
		this.emprestimo = emprestimo;
	}

	public Date getDevolucao() {
		return devolucao;
	}

	public void setDevolucao(Date devolucao) {
		this.devolucao = devolucao;
	}

	public double getMulta() {
		return multa;
	}

	public void setMulta(double multa) {
		this.multa = multa;
	}

	@Override
	public String toString() {
		return "Devolucao = " + emprestimo + ", Data da devolucao = " + data.format(devolucao) + ", Multa = " + multa + "]";
	}	
	
}
