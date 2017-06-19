package br.com.pirone.salaodazilda.web.servico.incluir;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.com.pirone.salaodazilda.domain.Servico;

@Named
@SessionScoped
public class IncluirServicoView implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Servico servicoInclusao;

	public Servico getServicoInclusao() {
		return servicoInclusao;
	}

	public void setServicoInclusao(Servico servicoInclusao) {
		this.servicoInclusao = servicoInclusao;
	}

}

