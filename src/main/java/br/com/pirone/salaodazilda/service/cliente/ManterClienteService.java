package br.com.pirone.salaodazilda.service.cliente;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.pirone.salaodazilda.domain.Cliente;
import br.com.pirone.salaodazilda.repository.ManterClienteRepository;

@Named
@RequestScoped
public class ManterClienteService {
	
	@Inject
	ManterClienteRepository clienteRepository;

	public List<Cliente> consultar(Cliente cliente) {
		return clienteRepository.consultarClientes(cliente);
	}
	
	public void incluir(Cliente cliente) {
		clienteRepository.incluir(cliente);
	}
	
	public void alterar(Cliente cliente) {
		clienteRepository.alterar(cliente);
	}

}
