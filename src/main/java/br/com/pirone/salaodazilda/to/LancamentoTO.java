package br.com.pirone.salaodazilda.to;

import br.com.pirone.salaodazilda.domain.LancamentoEntrada;
import br.com.pirone.salaodazilda.util.Periodo;

public class LancamentoTO {
	
	private LancamentoEntrada lancamentoEntrada = new LancamentoEntrada();
	private Periodo periodo = new Periodo();
	
	public LancamentoEntrada getLancamentoEntrada() {
		return lancamentoEntrada;
	}
	public void setLancamentoEntrada(LancamentoEntrada lancamentoEntrada) {
		this.lancamentoEntrada = lancamentoEntrada;
	}
	public Periodo getPeriodo() {
		return periodo;
	}
	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}

}
