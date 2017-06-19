package br.com.pirone.salaodazilda.web.cliente.incluir;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.pirone.salaodazilda.domain.Cliente;
import br.com.pirone.salaodazilda.service.cliente.ManterClienteService;

@Named
@RequestScoped
public class IncluirClienteController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private IncluirClienteView view;

	@Inject
	private ManterClienteService service;

	public IncluirClienteView getView() {
		return view;
	}

	public void setView(IncluirClienteView view) {
		this.view = view;
	}
	
	public void incluir() {
		service.incluir(view.getClienteInclusao());
	}

	@PostConstruct
	void post() {
		this.view.setClienteInclusao(new Cliente());
	}

}
