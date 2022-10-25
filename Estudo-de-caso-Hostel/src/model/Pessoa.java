package model;

import java.time.LocalDate;

public abstract class Pessoa {
	
	private String nome;
	private Integer rg;
	private LocalDate dtNasc;
	private String cidadeResid;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getRg() {
		return rg;
	}
	public void setRg(Integer rg) {
		this.rg = rg;
	}
	public LocalDate getDtNasc() {
		return dtNasc;
	}
	public void setDtNasc(LocalDate dtNasc) {
		this.dtNasc = dtNasc;
	}
	public String getCidadeResid() {
		return cidadeResid;
	}
	public void setCidadeResid(String cidadeResid) {
		this.cidadeResid = cidadeResid;
	}
	
	

}
