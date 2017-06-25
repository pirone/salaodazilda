package br.com.pirone.salaodazilda.web.servico.incluir;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.pirone.salaodazilda.service.categoriaservico.ManterCategoriaService;
import br.com.pirone.salaodazilda.service.servico.ManterServicoService;
import br.com.pirone.salaodazilda.to.ServicoTO;
import br.com.pirone.salaodazilda.web.servico.IncluirServicoView;
		
@Named
@RequestScoped
public class IncluirServicoController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private IncluirServicoView view;
	
	@Inject
	private ManterServicoService servicoService;

	@Inject
	private ManterCategoriaService categoriaService;
	
	public IncluirServicoView getView() {
		return view;
	}

	public void setView(IncluirServicoView view) {
		this.view = view;
	}

	public void incluirServico() {
		servicoService.incluir(view.getServicoInclusao().getServico());
	}

	@PostConstruct
	void post() {
		this.view.setServicoInclusao(new ServicoTO());
		this.view.getServicoInclusao().setCategorias(categoriaService.consultar());
	}
	
}
