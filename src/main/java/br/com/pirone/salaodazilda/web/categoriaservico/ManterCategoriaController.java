package br.com.pirone.salaodazilda.web.categoriaservico;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.omnifaces.cdi.ViewScoped;

import br.com.pirone.salaodazilda.service.categoriaservico.ManterCategoriaService;

@Named
@ViewScoped
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
	
	public String incluir() {
		service.incluir(incluirView.getCategoriaInclusao());
		
		return "consultarCategoria";
	}
	
	

	@PostConstruct
	void post() {
	}

}
