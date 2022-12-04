package model;

import java.time.LocalDate;

public class Cliente extends Pessoa{
	private Long cpf;
	private String email;
	private Long telefone;
	private Integer qtdeOcupacoes;
	
	public Cliente() {
		
	}
	public Cliente(String nome, Integer rg, LocalDate dtNasc,
			String cidadeResid, Long cpf, String email, 
			Long telefone, Integer qtdeOcupacoes) {
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
	public Long getTelefone() {
		return telefone;
	}
	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}
	public Integer getQtdeOcupacoes() {
		return qtdeOcupacoes;
	}
	public void setQtdeOcupacoes(Integer qtdeOcupacoes) {
		this.qtdeOcupacoes = qtdeOcupacoes;
	}
	
	@Override
	public String toString() {
		
		return "Nome:\n"+super.getNome()+"\n"+
		"RG:\n"+super.getRg()+"\n"+"Data Nascimento:\n"+super.getDtNasc()+"\n"+
		"Cidade Residencia:\n"+super.getCidadeResid()+"\n"+"CPF:\n"+this.cpf+
		"\n"+"Email:\n"+this.getEmail()+"\n"+"Telefone:\n"+this.getTelefone()+
		"\n"+"Quantidade Ocupaçoes\n"+this.getQtdeOcupacoes();
	}

}
