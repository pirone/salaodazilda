package br.com.pirone.salaodazilda.repository;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;

import com.uaihebert.uaicriteria.UaiCriteria;
import com.uaihebert.uaicriteria.UaiCriteriaFactory;

import br.com.pirone.salaodazilda.config.GenericEntityManager;
import br.com.pirone.salaodazilda.domain.Cliente;

@RequestScoped
public class ManterClienteRepository extends GenericEntityManager implements Serializable {

	private static final long serialVersionUID = -1260001482027640230L;
	
	final UaiCriteria<Cliente> uaiCriteria = UaiCriteriaFactory.createQueryCriteria(em, Cliente.class);
	
	public List<Cliente> consultarClientes(Cliente cliente) {
		uaiCriteria.andStringLike("cpf", "%"+cliente.getCpf()+"%")
		.andStringLike("nome", "%"+cliente.getNome()+"%")
		.andStringLike("email", "%"+cliente.getEmail()+"%")
		.andStringLike("endereco", "%"+cliente.getEndereco()+"%");
		return uaiCriteria.getResultList();
	}
	
	public List<Cliente> consultarTodos() {
		return uaiCriteria.getResultList();
	}

}
