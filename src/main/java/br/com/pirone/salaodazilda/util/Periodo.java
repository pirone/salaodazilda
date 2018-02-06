package br.com.pirone.salaodazilda.util;

import java.time.LocalDate;
import java.util.Date;

import br.com.pirone.salaodazilda.enums.Mes;

public class Periodo {
	
	private Date dataInicio;
	private Date dataFim;
	
	public Periodo() {
	}
	
	public Periodo(Date dataInicio, Date dataFim) {
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}
	
	public Periodo(Mes mes, int ano) {
		LocalDate dataInicial = LocalDate.of(ano, mes.getNum(), 1);
		this.dataInicio = DateUtil.asDate(dataInicial);
		this.dataFim = DateUtil.asDate(dataInicial.withDayOfMonth(dataInicial.lengthOfMonth()));
	}
	
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
