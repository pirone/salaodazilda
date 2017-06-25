package br.com.pirone.salaodazilda.web.cliente;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.omnifaces.cdi.ViewScoped;

import br.com.pirone.salaodazilda.common.GrowlMessages;
import br.com.pirone.salaodazilda.domain.Cliente;
import br.com.pirone.salaodazilda.domain.Servico;
import br.com.pirone.salaodazilda.service.cliente.ManterClienteService;

@Named
@ViewScoped
public class ManterClienteController implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Inject
	private ConsultarClienteView consultarView;
	
	@Inject
	private IncluirClienteView incluirView;
	
	@Inject
	private GrowlMessages growl;

	@Inject
	private ManterClienteService service;
	
	public ConsultarClienteView getConsultarView() {
		return consultarView;
	}

	public void setConsultarView(ConsultarClienteView consultarView) {
		this.consultarView = consultarView;
	}

	public IncluirClienteView getIncluirView() {
		return incluirView;
	}

	public void setIncluirView(IncluirClienteView incluirView) {
		this.incluirView = incluirView;
	}

	public ManterClienteService getService() {
		return service;
	}

	public void setService(ManterClienteService service) {
		this.service = service;
	}

	public GrowlMessages getGrowl() {
		return growl;
	}

	public void setGrowl(GrowlMessages growl) {
		this.growl = growl;
	}

	public void incluir() {
		service.incluir(incluirView.getClienteInclusao());
	}
	
	public void consultar() {
		this.consultarView.setResultado(service.consultar(consultarView.getClienteConsulta()));
	}

	public void inativar(Servico servico) {
		
		growl.exclusaoSucesso();
	}

	@PostConstruct
	void post() {
		this.incluirView.setClienteInclusao(new Cliente());
	}


}
