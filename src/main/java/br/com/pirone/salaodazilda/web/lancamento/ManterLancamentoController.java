package br.com.pirone.salaodazilda.web.lancamento;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.omnifaces.cdi.ViewScoped;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.pirone.salaodazilda.domain.LancamentoEntrada;
import br.com.pirone.salaodazilda.service.lancamento.ManterLancamentoService;

@Named
@ViewScoped
public class ManterLancamentoController implements Serializable {
	
	private Logger logger = LoggerFactory.getLogger(ManterLancamentoController.class);

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
		this.view.setLancamentoInclusao(new LancamentoEntrada());
	}
	
	public void salvar() {
		logger.info("Teste");
		service.salvar(view.getLancamentoInclusao());
	}

}

