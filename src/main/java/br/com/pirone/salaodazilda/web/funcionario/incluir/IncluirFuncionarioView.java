package br.com.pirone.salaodazilda.web.funcionario.incluir;

import java.io.Serializable;

import javax.inject.Named;

import org.omnifaces.cdi.ViewScoped;

import br.com.pirone.salaodazilda.domain.Funcionario;

@Named
@ViewScoped
public class IncluirFuncionarioView implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public IncluirFuncionarioView() {
		funcionarioInclusao = new Funcionario();
	}

	
	private Funcionario funcionarioInclusao;


	public Funcionario getFuncionarioInclusao() {
		return funcionarioInclusao;
	}


	public void setFuncionarioInclusao(Funcionario funcionarioInclusao) {
		this.funcionarioInclusao = funcionarioInclusao;
	}
	
}
