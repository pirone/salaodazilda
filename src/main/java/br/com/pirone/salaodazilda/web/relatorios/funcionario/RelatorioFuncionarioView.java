package br.com.pirone.salaodazilda.web.relatorios.funcionario;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.com.pirone.salaodazilda.enums.Mes;
import br.com.pirone.salaodazilda.to.RelatorioFuncionarioPesqTO;
import br.com.pirone.salaodazilda.to.RelatorioFuncionarioTO;

@Named
@SessionScoped
public class RelatorioFuncionarioView implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private RelatorioFuncionarioPesqTO pesquisaTO;
	private RelatorioFuncionarioTO relatorioTO = new RelatorioFuncionarioTO();

	public RelatorioFuncionarioPesqTO getPesquisaTO() {
		return pesquisaTO;
	}

	public void setPesquisaTO(RelatorioFuncionarioPesqTO pesquisaTO) {
		this.pesquisaTO = pesquisaTO;
	}

	public Mes[] listaMeses() {
		return Mes.values();
	}
	
	public RelatorioFuncionarioTO getRelatorioTO() {
		return relatorioTO;
	}

	public void setRelatorioTO(RelatorioFuncionarioTO relatorioTO) {
		this.relatorioTO = relatorioTO;
	}

}
