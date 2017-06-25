package br.com.pirone.salaodazilda.web.categoriaservico;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.pirone.salaodazilda.service.categoriaservico.ManterCategoriaService;

@Named
@RequestScoped
public class ManterCategoriaController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private ConsultarCategoriaView consultarView;
	
	@Inject
	private IncluirCategoriaView incluirView;

	@Inject
	private ManterCategoriaService service;

	public ConsultarCategoriaView getConsultarView() {
		return consultarView;
	}

	public void setConsultarCategoriaView(ConsultarCategoriaView view) {
		this.consultarView = view;
	}
	
	public IncluirCategoriaView getIncluirView() {
		return incluirView;
	}

	public void setIncluirView(IncluirCategoriaView incluirView) {
		this.incluirView = incluirView;
	}

	public void consultar() {
		this.consultarView.setResultado(service.consultar());
	}
	
	public void incluir() {
		service.incluir(incluirView.getCategoriaInclusao());
	}
	
	

	@PostConstruct
	void post() {
	}

}
