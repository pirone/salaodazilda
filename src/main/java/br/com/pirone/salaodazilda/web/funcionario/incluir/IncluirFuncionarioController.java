package br.com.pirone.salaodazilda.web.funcionario.incluir;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.pirone.salaodazilda.service.funcionario.ManterFuncionarioService;

@Named
@RequestScoped
public class IncluirFuncionarioController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private IncluirFuncionarioView view;

	@Inject
	private ManterFuncionarioService service;

	public IncluirFuncionarioView getView() {
		return view;
	}

	public void setView(IncluirFuncionarioView view) {
		this.view = view;
	}
	
	public void incluir() {
		service.incluir(view.getFuncionarioInclusao());
	}

	@PostConstruct
	void post() {
	}

}

