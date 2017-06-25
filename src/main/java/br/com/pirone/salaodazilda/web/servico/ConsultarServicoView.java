package br.com.pirone.salaodazilda.web.servico;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.com.pirone.salaodazilda.domain.Servico;

@Named
@SessionScoped
public class ConsultarServicoView implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ConsultarServicoView() {
		servico = new Servico();
	}

	private Servico servico;

	private Servico servicoEdicao;

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

	public Servico getServicoEdicao() {
		return servicoEdicao;
	}

	public void setServicoEdicao(Servico servicoEdicao) {
		this.servicoEdicao = servicoEdicao;
	}

}
