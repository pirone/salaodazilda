package br.com.pirone.salaodazilda.web.servico.consultar;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.pirone.salaodazilda.common.GrowlMessages;
import br.com.pirone.salaodazilda.domain.Servico;
import br.com.pirone.salaodazilda.service.servico.ManterServicoService;

@Named
@SessionScoped
public class ConsultarServicoController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private ConsultarServicoView view;

	@Inject
	private ManterServicoService servicoService;

	@Inject
	private GrowlMessages growl;

	public ConsultarServicoView getIncluirServicoView() {
		return view;
	}

	public ConsultarServicoView getView() {
		return view;
	}

	public void setView(ConsultarServicoView view) {
		this.view = view;
	}

	public void consultar() {
		if(view.getServico().getPreco() == null) {
			view.getServico().setPreco(new BigDecimal(0));
		}
		view.setResultado(servicoService.consultar(view.getServico()));
	}

	public void inativar(Servico servico) {
		servicoService.inativar(servico);
		growl.exclusaoSucesso();
	}
	
	public void alterar() {
		servicoService.alterar(this.view.getServicoEdicao());
		growl.alteracaoSucesso();
	}


}
