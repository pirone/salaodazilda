package br.com.pirone.salaodazilda.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import br.com.pirone.salaodazilda.common.GenericEntity;


/**
 * The persistent class for the cliente database table.
 * 
 */
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable, GenericEntity {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_usuario")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String login;

	private String senha;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	 @Override
     public int hashCode() {
               final int prime = 31;
               int result = 1;
               result = prime * result + ((id == null) ? 0 : id.hashCode());
               return result;
     }

	
}