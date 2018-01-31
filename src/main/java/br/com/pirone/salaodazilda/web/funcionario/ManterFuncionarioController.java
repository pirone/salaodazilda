package br.com.pirone.salaodazilda.web.funcionario;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.omnifaces.cdi.ViewScoped;

import br.com.pirone.salaodazilda.domain.Funcionario;
import br.com.pirone.salaodazilda.service.funcionario.ManterFuncionarioService;
import br.com.pirone.salaodazilda.web.BaseController;

@Named
@ViewScoped
public class ManterFuncionarioController extends BaseController implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Inject
	private IncluirFuncionarioView incluirView;

	@Inject
	private ManterFuncionarioService service;
	
	@Inject
	private ConsultarFuncionarioView consultarView;

	
	public IncluirFuncionarioView getIncluirView() {
		return incluirView;
	}

	public void setIncluirView(IncluirFuncionarioView incluirView) {
		this.incluirView = incluirView;
	}

	public ManterFuncionarioService getService() {
		return service;
	}

	public void setService(ManterFuncionarioService service) {
		this.service = service;
	}

	public ConsultarFuncionarioView getConsultarView() {
		return consultarView;
	}

	public void setConsultarView(ConsultarFuncionarioView consultarView) {
		this.consultarView = consultarView;
	}

	public void incluir() {
		try {
			service.incluir(incluirView.getFuncionarioInclusao());
			this.incluirView.setFuncionarioInclusao(new Funcionario());
		} catch (Exception e) {
			enviarMensagemErro();
		}
		
	}
	
	public void consultar() {
		this.consultarView.setResultado(service.consultarFuncionarios(consultarView.getFuncionarioConsulta()));
	}


	@PostConstruct
	void post() {
	}

}
