package br.com.pirone.salaodazilda.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.pirone.salaodazilda.common.GenericEntity;
import br.com.pirone.salaodazilda.enums.TipoLancamento;


/**
 * The persistent class for the cliente database table.
 * 
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@NamedQuery(name="Lancamento.findAll", query="SELECT c FROM Lancamento c")
public abstract class Lancamento implements Serializable, GenericEntity {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_lancamento")
	private Integer id;
	
	@Column(name = "valor_lancamento")
	private BigDecimal valorLancamento;
	
	@Enumerated
	@Column(name = "tipo_lancamento")
	private TipoLancamento tipoLancamento;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_lancamento")
	private Date dataLancamento;
	
	@Column(name = "observacao")
	private String observacao;

	public Lancamento() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getValorLancamento() {
		return valorLancamento;
	}

	public void setValorLancamento(BigDecimal valorLancamento) {
		this.valorLancamento = valorLancamento;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public TipoLancamento getTipoLancamento() {
		return tipoLancamento;
	}

	public void setTipoLancamento(TipoLancamento tipoLancamento) {
		this.tipoLancamento = tipoLancamento;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}


}