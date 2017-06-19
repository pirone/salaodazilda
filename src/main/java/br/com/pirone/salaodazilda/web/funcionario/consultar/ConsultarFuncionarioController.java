package br.com.pirone.salaodazilda.web.funcionario.consultar;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.pirone.salaodazilda.service.funcionario.ManterFuncionarioService;

@Named
@RequestScoped
public class ConsultarFuncionarioController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private ConsultarFuncionarioView view;

	@Inject
	private ManterFuncionarioService service;

	public ConsultarFuncionarioView getView() {
		return view;
	}

	public void setView(ConsultarFuncionarioView view) {
		this.view = view;
	}
	
	public void consultar() {
		this.view.setResultado(service.consultarFuncionarios(view.getFuncionarioConsulta()));
	}

	@PostConstruct
	void post() {
	}

}

