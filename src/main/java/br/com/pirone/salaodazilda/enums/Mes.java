package br.com.pirone.salaodazilda.enums;

public enum Mes {
	
	JANEIRO(1, "Janeiro"), FEVEREIRO(2, "Fevereiro"), MARCO(3, "Março"), ABRIL(4, "Abril"), MAIO(5, "Maio"), JUNHO(6, "Junho"), JULHO(7, "Julho"), AGOSTO(8, "Agosto"),
	SETEMBRO(9, "Setembro"), OUTUBRO(10, "Outubro"), NOVEMBRO(11, "Novembro"), DEZEMBRO(12, "Dezembro");

	private Integer num;
	private String descricao;
	
	private Mes(int num, String descricao) {
		this.num = num;
		this.descricao = descricao;
	}
	
	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
