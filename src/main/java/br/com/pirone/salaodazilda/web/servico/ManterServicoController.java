package br.com.pirone.salaodazilda.web.servico;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.pirone.salaodazilda.domain.Servico;
		
@Named
@RequestScoped
public class ManterServicoController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Servico servicoInclusao;
	
	private String nome;
	
	@Inject
	private IncluirServicoView incluirServicoView;

	public IncluirServicoView getIncluirServicoView() {
		return incluirServicoView;
	}

	public void setIncluirServicoView(IncluirServicoView incluirServicoView) {
		
		this.incluirServicoView = incluirServicoView;
	}
	
	
	public void incluirServico() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("salaodazildaPU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(servicoInclusao);
		em.getTransaction().commit();
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
	
	@PostConstruct
	void post() {
		this.servicoInclusao = new Servico();
		this.incluirServicoView.setServico(new Servico());
	}
	
}
