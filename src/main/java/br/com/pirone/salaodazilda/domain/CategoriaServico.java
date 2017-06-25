package br.com.pirone.salaodazilda.domain;

import java.io.Serializable;
import javax.persistence.*;

import br.com.pirone.salaodazilda.common.GenericEntity;

/**
 * Entity implementation class for Entity: Categoria
 *
 */
@Entity
@Table(name = "categoria_servico")
@NamedQuery(name="CategoriaServico.findAll", query="SELECT c FROM CategoriaServico c")
public class CategoriaServico implements Serializable, GenericEntity {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_categoria")
	private Integer id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "descricao")
	private String descricao;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
   
}
