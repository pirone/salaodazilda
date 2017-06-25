package br.com.pirone.salaodazilda.web.servico;

import java.io.Serializable;

import javax.enterprise.context.ConversationScoped;
import javax.inject.Named;

import br.com.pirone.salaodazilda.to.ServicoTO;

@Named
@ConversationScoped
public class IncluirServicoView implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ServicoTO servicoInclusao;

	public ServicoTO getServicoInclusao() {
		if (servicoInclusao == null) {
			servicoInclusao = new ServicoTO();
		}
		return servicoInclusao;
	}

	public void setServicoInclusao(ServicoTO servicoInclusao) {
		this.servicoInclusao = servicoInclusao;
	}

}

