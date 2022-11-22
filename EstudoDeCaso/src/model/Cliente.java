package model;

import java.time.LocalDate;

public class Cliente extends Pessoa{
	private Long cpf;
	private String email;
	private Integer telefone;
	private Integer qtdeOcupacoes;
	
	public Cliente() {
		
	}
	public Cliente(String nome, Integer rg, LocalDate dtNasc,
			String cidadeResid, Long cpf, String email, 
			Integer telefone, Integer qtdeOcupacoes) {
		super.setNome(nome);
		super.setDtNasc(dtNasc);
		super.setCidadeResid(cidadeResid);
		this.cpf=cpf;
		this.email=email;
		this.telefone=telefone;
		this.qtdeOcupacoes=qtdeOcupacoes;
	}
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getTelefone() {
		return telefone;
	}
	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}
	public Integer getQtdeOcupacoes() {
		return qtdeOcupacoes;
	}
	public void setQtdeOcupacoes(Integer qtdeOcupacoes) {
		this.qtdeOcupacoes = qtdeOcupacoes;
	}

}
