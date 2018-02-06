package br.com.pirone.salaodazilda.web.relatorios.funcionario;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.omnifaces.cdi.ViewScoped;

import br.com.pirone.salaodazilda.service.relatorio.RelatorioFuncionarioService;
import br.com.pirone.salaodazilda.to.RelatorioFuncionarioPesqTO;
import br.com.pirone.salaodazilda.web.BaseController;

@Named
@ViewScoped
public class RelatorioFuncionarioController extends BaseController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private RelatorioFuncionarioView view;

	@Inject
	private RelatorioFuncionarioService service;
	
	public void consultar() {
		try {
			this.view.setRelatorioTO(service.consultarExtrato(this.view.getPesquisaTO()));
		} catch (Exception e) {
			enviarMensagemErro();
		}
	}

	public RelatorioFuncionarioView getView() {
		return view;
	}

	public void setView(RelatorioFuncionarioView view) {
		this.view = view;
	}

	@PostConstruct
	void post() {
		this.view.setPesquisaTO(new RelatorioFuncionarioPesqTO());
	}

}

