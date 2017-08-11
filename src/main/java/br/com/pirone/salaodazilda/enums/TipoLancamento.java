package br.com.pirone.salaodazilda.enums;

public enum TipoLancamento {
	
	DEBITO("D", "Débito"), CREDITO("C", "Crédito");
	
	private String valor;
	private String descricao;
	
	private TipoLancamento(String valor, String descricao) {
		this.valor = valor;
		this.descricao = descricao;
	}

	public String getValor() {
		return valor;
	}


	public void setValor(String valor) {
		this.valor = valor;
	}


	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
