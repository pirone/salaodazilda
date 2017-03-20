package br.com.pirone.salaodazilda.web.servico.consultar;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import org.omnifaces.cdi.ViewScoped;

import br.com.pirone.salaodazilda.domain.Servico;

@Named
@ViewScoped
public class ConsultarServicoView implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ConsultarServicoView() {
		resultado = new ArrayList<>();
		servico = new Servico();
	}
	
	private Servico servico;
	
	private List<Servico> resultado;
	
	public Servico getServico() {
		return servico;
	}
	
	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public List<Servico> getResultado() {
		return resultado;
	}

	public void setResultado(List<Servico> resultado) {
		this.resultado = resultado;
	}

}
