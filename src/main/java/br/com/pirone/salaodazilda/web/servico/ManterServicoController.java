package br.com.pirone.salaodazilda.web.servico;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.pirone.salaodazilda.domain.Servico;
import br.com.pirone.salaodazilda.service.manterServico.ManterServicoService;
import br.com.pirone.salaodazilda.web.servico.consultar.ConsultarServicoView;
		
@Named
@RequestScoped
public class ManterServicoController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Servico servicoInclusao;
	
	private String nome;
	
	private Servico servico;
	
	private List<Servico> resultado;
	
	@Inject
	private ConsultarServicoView incluirServicoView;
	
	@Inject
	private ManterServicoService servicoService;

	public ConsultarServicoView getIncluirServicoView() {
		return incluirServicoView;
	}

	public void setIncluirServicoView(ConsultarServicoView incluirServicoView) {
		
		this.incluirServicoView = incluirServicoView;
	}
	
	public void incluirServico() {
		
		

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("salaodazildaPU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(servicoInclusao);
		em.getTransaction().commit();
	}
	
	public void consultar() {
		this.setResultado(servicoService.consultar());
	}

	public Servico getServicoInclusao() {
		return servicoInclusao;
	}

	public void setServicoInclusao(Servico servicoInclusao) {
		this.servicoInclusao = servicoInclusao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Servico> getResultado() {
		return resultado;
	}

	public void setResultado(List<Servico> resultado) {
		this.resultado = resultado;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

	@PostConstruct
	void post() {
		this.servicoInclusao = new Servico();
		this.incluirServicoView.setServico(new Servico());
	}
	
}
