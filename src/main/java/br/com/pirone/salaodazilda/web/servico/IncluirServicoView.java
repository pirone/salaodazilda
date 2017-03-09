package br.com.pirone.salaodazilda.web.servico;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import br.com.pirone.salaodazilda.domain.Servico;

@ManagedBean
public class IncluirServicoView implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Servico servico;
	
	public Servico getServico() {
		if (servico == null) {
	        servico = new Servico();
		}
		return servico;
	}
	public void setServico(Servico servico) {
		this.servico = servico;
	}

}
