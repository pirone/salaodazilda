package br.com.pirone.salaodazilda.web.servico.consultar;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.pirone.salaodazilda.service.manterServico.ManterServicoService;

@Named
@RequestScoped
public class ConsultarServicoController implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private ConsultarServicoView consultarServicoView;
	
	@Inject
	private ManterServicoService servicoService;

	public ConsultarServicoView getIncluirServicoView() {
		return consultarServicoView;
	}

	public void setIncluirServicoView(ConsultarServicoView consultarServicoView) {
		
		this.consultarServicoView = consultarServicoView;
	}
	
	public void consultar() {
		consultarServicoView.setResultado(servicoService.consultar());
	}

	public ConsultarServicoView getConsultarServicoView() {
		return consultarServicoView;
	}

	public void setConsultarServicoView(ConsultarServicoView consultarServicoView) {
		this.consultarServicoView = consultarServicoView;
	}
}
