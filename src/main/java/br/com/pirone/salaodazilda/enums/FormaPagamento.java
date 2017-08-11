package br.com.pirone.salaodazilda.enums;

public enum FormaPagamento {

	DEBITO(0, "Débito"), CREDITO(1, "Crédito"), DINHEIRO(2, "Dinheiro"), CHEQUE(3, "Cheque");
	
	private int valor;
	private String descricao;
	
	private FormaPagamento(int valor, String descricao) {
		this.valor = valor;
		this.descricao = descricao;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
