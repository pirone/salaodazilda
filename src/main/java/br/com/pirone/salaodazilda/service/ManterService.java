package br.com.pirone.salaodazilda.service;

import java.util.List;

import br.com.pirone.salaodazilda.domain.Servico;

public interface ManterService {

	List<Servico> consultar(Object object);
	
	void inativar(Object object);
	
	void incluir(Object object);
	
	void alterar(Object object);
}
