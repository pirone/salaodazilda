package br.com.pirone.salaodazilda.repository;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;

import com.uaihebert.uaicriteria.UaiCriteria;
import com.uaihebert.uaicriteria.UaiCriteriaFactory;

import br.com.pirone.salaodazilda.config.GenericEntityManager;
import br.com.pirone.salaodazilda.domain.CategoriaServico;

@RequestScoped
public class ManterCategoriaServicoRepository extends GenericEntityManager implements Serializable {

	private static final long serialVersionUID = -4889146087144383294L;

	final UaiCriteria<CategoriaServico> uaiCriteria = UaiCriteriaFactory.createQueryCriteria(em, CategoriaServico.class);
	
	public List<CategoriaServico> listarCategorias() {
		return uaiCriteria.getResultList();
	}
}
