package br.com.pirone.salaodazilda.to;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import br.com.pirone.salaodazilda.domain.Funcionario;
import br.com.pirone.salaodazilda.domain.LancamentoEntrada;

public class RelatorioFuncionarioTO {
	
	private Funcionario funcionario;
	private List<LancamentoEntrada> lancamentosFuncionario;
	
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public List<LancamentoEntrada> getLancamentosFuncionario() {
		return lancamentosFuncionario;
	}
	public void setLancamentosFuncionario(List<LancamentoEntrada> lancamentosFuncionario) {
		this.lancamentosFuncionario = lancamentosFuncionario;
	}
	
	public BigDecimal totalLancamentos() {
		return lancamentosFuncionario.stream().map(l -> l.getValorLancamento()).reduce(BigDecimal::add).get();
	}
	
	public BigDecimal totalComissao() {
		return lancamentosFuncionario.stream().map(l -> l.getValorComissao()).reduce(BigDecimal::add).get().setScale(2, RoundingMode.HALF_UP);
	}

}
