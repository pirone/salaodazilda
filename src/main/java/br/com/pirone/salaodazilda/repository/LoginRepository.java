package br.com.pirone.salaodazilda.repository;

import javax.enterprise.context.RequestScoped;
import javax.persistence.NoResultException;

import com.uaihebert.uaicriteria.UaiCriteria;
import com.uaihebert.uaicriteria.UaiCriteriaFactory;

import br.com.pirone.salaodazilda.config.GenericEntityManager;
import br.com.pirone.salaodazilda.domain.Usuario;

@RequestScoped
public class LoginRepository extends GenericEntityManager	{
	
	final UaiCriteria<Usuario> uaiCriteria = UaiCriteriaFactory.createQueryCriteria(em, Usuario.class);
	
	public void logar(String usuario, String senha) throws NoResultException {
		uaiCriteria.andEquals("login", usuario).andEquals("senha", senha).getSingleResult();
	}
}


