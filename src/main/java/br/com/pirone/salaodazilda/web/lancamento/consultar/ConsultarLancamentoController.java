package br.com.pirone.salaodazilda.web.lancamento.consultar;

import java.io.Serializable;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.omnifaces.cdi.ViewScoped;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.pirone.salaodazilda.service.lancamento.ManterLancamentoService;
import br.com.pirone.salaodazilda.to.LancamentoTO;
import br.com.pirone.salaodazilda.web.BaseController;

@Named
@ViewScoped
public class ConsultarLancamentoController extends BaseController implements Serializable {
	
	private Logger logger = LoggerFactory.getLogger(ConsultarLancamentoController.class);

	private static final long serialVersionUID = 1L;

	@Inject
	private ConsultarLancamentoView view;
	
	@Inject
	private ManterLancamentoService service;


	@PostConstruct
	void post() {
		this.view.setListaFuncionarios(service.getFuncionarioRepository().listarAtivos());
		this.view.setListaServico(service.getServicoRepository().listarAtivos());
		this.view.setListaClientes(service.getClienteRepository().consultarTodos());
		this.view.setLancamento(new LancamentoTO());
		this.view.setResultado(new ArrayList<>());
	}
	
	public ConsultarLancamentoView getView() {
		return view;
	}

	public void setView(ConsultarLancamentoView view) {
		this.view = view;
	}
	
	public void consultar() {
		try {
			this.view.setResultado(service.consultar(this.view.getLancamento()));
		} catch (Exception e) {
			logger.error(e.getMessage());
			enviarMensagemErro();
		}
	}

}

