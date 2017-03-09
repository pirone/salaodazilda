package br.com.pirone.salaodazilda.service.manterServico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.pirone.salaodazilda.domain.Servico;

public class ManterServicoService implements ManterServicoServiceLocal {
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("servico");
	EntityManager manager = factory.createEntityManager();

	@Override
	public void incluirServico(Servico servico) {
		manager.persist(servico);
	}

}
