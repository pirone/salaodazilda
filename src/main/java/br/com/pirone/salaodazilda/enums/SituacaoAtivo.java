package br.com.pirone.salaodazilda.enums;

public enum SituacaoAtivo {
	
	ATIVO("S"), INATIVO("N");
	
	private String sigla;
	
	private SituacaoAtivo(String sigla) {
		this.setSigla(sigla);
		
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
}
