package br.com.pirone.salaodazilda.service.funcionario;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import br.com.pirone.salaodazilda.domain.Funcionario;
import br.com.pirone.salaodazilda.repository.ManterFuncionarioRepository;

@RequestScoped
public class ManterFuncionarioService {
	
	@Inject
	private ManterFuncionarioRepository repository;
	
	public List<Funcionario> consultarFuncionarios(Funcionario funcionario) {
		return repository.consultarFuncionarios(funcionario);
	}
	
	public void incluir(Funcionario funcionario) {
		repository.incluir(funcionario);
	}

}
