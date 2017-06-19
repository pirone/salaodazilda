package br.com.pirone.salaodazilda.web.cliente.consultar;

import java.io.Serializable;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.pirone.salaodazilda.common.GrowlMessages;
import br.com.pirone.salaodazilda.domain.Cliente;
import br.com.pirone.salaodazilda.domain.Servico;
import br.com.pirone.salaodazilda.service.cliente.ManterClienteService;

@Named
@ConversationScoped
public class ConsultarClienteController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private ConsultarClienteView view;

	@Inject
	private GrowlMessages growl;

	@Inject
	ManterClienteService service;
	
	public void consultar() {
		this.view.setResultado(service.consultar(view.getClienteConsulta()));
	}

	public void inativar(Servico servico) {
		
		growl.exclusaoSucesso();
	}

	public ConsultarClienteView getView() {
		return view;
	}

	public void setView(ConsultarClienteView view) {
		this.view = view;
	}
	
	@PostConstruct
	void post() {
		this.view.setResultado(new ArrayList<Cliente>());
	}

}
