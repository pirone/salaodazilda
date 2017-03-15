package br.com.pirone.salaodazilda.web.servico;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.pirone.salaodazilda.domain.Servico;

@Named
@RequestScoped
public class IncluirServicoView implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public IncluirServicoView() {
		this.servico = new Servico();
	}
	
	private Servico servico;
	
	public Servico getServico() {
		return servico;
	}
	
	public void setServico(Servico servico) {
		this.servico = servico;
	}

}
