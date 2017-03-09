package br.com.pirone.salaodazilda.web.servico;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.pirone.salaodazilda.DAO.ManterServicoDAO;
import br.com.pirone.salaodazilda.domain.Servico;

@ManagedBean
@ViewScoped
public class ManterServicoController implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	ManterServicoDAO manterDAO = new ManterServicoDAO();
	
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
		
		
		this.servicoInclusao = new Servico();

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("salaodazildaPU");
		this.getNome();
		this.incluirServicoView.getServico().getDescricao();
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		servicoInclusao = new Servico();
		servicoInclusao.setNome("Teste2");
		servicoInclusao.setDescricao("Puts2");
		System.out.println("COMIITING");
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
	
}
