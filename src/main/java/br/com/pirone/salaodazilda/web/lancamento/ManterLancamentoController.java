package br.com.pirone.salaodazilda.web.lancamento;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.pirone.salaodazilda.service.lancamento.ManterLancamentoService;

@Named
@RequestScoped
public class ManterLancamentoController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private IncluirLancamentoView view;

	@Inject
	private ManterLancamentoService service;

	public IncluirLancamentoView getView() {
		return view;
	}

	public void setView(IncluirLancamentoView view) {
		this.view = view;
	}

	@PostConstruct
	void post() {
		this.view.setListaFuncionarios(service.getFuncionarioRepository().listarAtivos());
		this.view.setListaServico(service.getServicoRepository().listarAtivos());
	}

}

