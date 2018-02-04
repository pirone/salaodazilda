package br.com.pirone.salaodazilda.util;

import java.util.Date;

public class Periodo {
	
	private Date dataInicio;
	private Date dataFim;
	
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataFim() {
		return dataFim;
	}
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	
	public boolean preenchido() {
		return (dataInicio != null) && (dataFim != null);
	}

}
