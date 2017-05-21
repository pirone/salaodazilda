package br.com.pirone.salaodazilda.web.servico.consultar;

import java.io.Serializable;

import javax.inject.Inject;
import javax.inject.Named;

import org.omnifaces.cdi.ViewScoped;

import br.com.pirone.salaodazilda.common.GrowlMessages;
import br.com.pirone.salaodazilda.domain.Servico;
import br.com.pirone.salaodazilda.service.manterServico.ManterServicoService;

@Named
@ViewScoped
public class ConsultarServicoController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private ConsultarServicoView consultarServicoView;

	@Inject
	private ManterServicoService servicoService;

	@Inject
	private GrowlMessages growl;

	public ConsultarServicoView getIncluirServicoView() {
		return consultarServicoView;
	}

	public void setIncluirServicoView(ConsultarServicoView consultarServicoView) {

		this.consultarServicoView = consultarServicoView;
	}

	public void consultar() {
		consultarServicoView.setResultado(servicoService.consultar(consultarServicoView.getServico()));
	}

	public void inativar(Servico servico) {
		servicoService.inativar(servico);
		growl.exclusaoSucesso();
	}

	public ConsultarServicoView getConsultarServicoView() {
		return consultarServicoView;
	}

	public void setConsultarServicoView(ConsultarServicoView consultarServicoView) {
		this.consultarServicoView = consultarServicoView;
	}
}
