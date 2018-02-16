package br.com.pirone.salaodazilda.web;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.NoResultException;

import br.com.pirone.salaodazilda.repository.LoginRepository;

@Named
@SessionScoped
public class LoginController extends BaseController {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private LoginRepository repository;
	
	private String usuario;
	private String senha;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String logar() {
		try {
			repository.logar(usuario, senha);
			return "index.html";
		} catch (NoResultException e) {
			enviarMensagemErro("Usuário ou senha inválidos");
			return "";
		}
	}

	@PostConstruct
	void post() {
	}

}

