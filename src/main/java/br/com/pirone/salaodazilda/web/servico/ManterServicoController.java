package br.com.pirone.salaodazilda.web.servico;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.omnifaces.cdi.ViewScoped;

import br.com.pirone.salaodazilda.common.GrowlMessages;
import br.com.pirone.salaodazilda.domain.Servico;
import br.com.pirone.salaodazilda.service.categoriaservico.ManterCategoriaService;
import br.com.pirone.salaodazilda.service.servico.ManterServicoService;
import br.com.pirone.salaodazilda.to.ServicoTO;

@Named
@ViewScoped
public class ManterServicoController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private ConsultarServicoView consultarView;

	@Inject
	private ManterServicoService servicoService;
	
	@Inject
	private ManterCategoriaService categoriaService;

	@Inject
	private GrowlMessages growl;

	@Inject
	private IncluirServicoView incluirView;


	public ConsultarServicoView getConsultarView() {
		return consultarView;
	}

	public void setConsultarView(ConsultarServicoView consultarView) {
		this.consultarView = consultarView;
	}

	public ManterServicoService getServicoService() {
		return servicoService;
	}

	public void setServicoService(ManterServicoService servicoService) {
		this.servicoService = servicoService;
	}

	public ManterCategoriaService getCategoriaService() {
		return categoriaService;
	}

	public void setCategoriaService(ManterCategoriaService categoriaService) {
		this.categoriaService = categoriaService;
	}

	public GrowlMessages getGrowl() {
		return growl;
	}

	public void setGrowl(GrowlMessages growl) {
		this.growl = growl;
	}

	public IncluirServicoView getIncluirView() {
		return incluirView;
	}

	public void setIncluirView(IncluirServicoView incluirView) {
		this.incluirView = incluirView;
	}

	public void incluirServico() {
		servicoService.incluir(incluirView.getServicoInclusao().getServico());
	}
	
	public void consultar() {
		if(consultarView.getServico().getPreco() == null) {
			consultarView.getServico().setPreco(new BigDecimal(0));
		}
		consultarView.setResultado(servicoService.consultar(consultarView.getServico()));
	}

	public void inativar(Servico servico) {
		servicoService.inativar(servico);
		growl.exclusaoSucesso();
	}
	
	public void alterar() {
		servicoService.alterar(this.consultarView.getServicoEdicao());
		growl.alteracaoSucesso();
	}
	
	@PostConstruct
	void post() {
		this.incluirView.setServicoInclusao(new ServicoTO());
		this.incluirView.getServicoInclusao().setCategorias(categoriaService.consultar());
	}


}
