package br.com.pirone.salaodazilda.to;

import java.time.LocalDate;

import br.com.pirone.salaodazilda.domain.Funcionario;
import br.com.pirone.salaodazilda.enums.Mes;

public class RelatorioFuncionarioPesqTO {
	
	private Funcionario funcionario;
	private Mes mes;
	private Integer ano = LocalDate.now().getYear();

	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public Mes getMes() {
		return mes;
	}
	public void setMes(Mes mes) {
		this.mes = mes;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}

}
