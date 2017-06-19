package br.com.pirone.salaodazilda.repository;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;

import com.uaihebert.uaicriteria.UaiCriteria;
import com.uaihebert.uaicriteria.UaiCriteriaFactory;

import br.com.pirone.salaodazilda.config.GenericEntityManager;
import br.com.pirone.salaodazilda.domain.Funcionario;

@RequestScoped
public class ManterFuncionarioRepository extends GenericEntityManager implements Serializable{

	private static final long serialVersionUID = 6710576813164447043L;
	
	final UaiCriteria<Funcionario> uaiCriteria = UaiCriteriaFactory.createQueryCriteria(em, Funcionario.class);
	
	public List<Funcionario> consultarFuncionarios(Funcionario funcionario) {
		uaiCriteria.andStringLike("cpf", "%"+funcionario.getCpf()+"%")
		.andStringLike("nome", "%"+funcionario.getNome()+"%")
		.andStringLike("email", "%"+funcionario.getEmail()+"%")
		.andStringLike("endereco", "%"+funcionario.getEndereco()+"%");
		return uaiCriteria.getResultList();
	}


}
