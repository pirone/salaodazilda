package br.com.pirone.salaodazilda.repository;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;

import com.uaihebert.uaicriteria.UaiCriteria;
import com.uaihebert.uaicriteria.UaiCriteriaFactory;

import br.com.pirone.salaodazilda.config.GenericEntityManager;
import br.com.pirone.salaodazilda.domain.Servico;
import br.com.pirone.salaodazilda.enums.SituacaoAtivo;

@RequestScoped
public class ManterServicoRepository extends GenericEntityManager implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8074264363377866625L;
	
	
	final UaiCriteria<Servico> uaiCriteria = UaiCriteriaFactory.createQueryCriteria(em, Servico.class);
	
	public List<Servico> consultarServicos(Servico servico) {
		uaiCriteria.andStringLike("nome", "%"+servico.getNome()+"%");
		uaiCriteria.andStringLike("descricao", "%"+servico.getDescricao()+"%");
		uaiCriteria.andGreaterOrEqualTo("preco", servico.getPreco());
		uaiCriteria.andEquals("st_ativo", SituacaoAtivo.ATIVO);
		return uaiCriteria.getResultList();
	}
	
	public void inativar(Servico servico) {
		servico.setSituacao(SituacaoAtivo.INATIVO);
		alterar(servico);
	}

}
