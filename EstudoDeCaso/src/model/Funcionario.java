package model;

import java.time.LocalDate;

public class Funcionario extends Pessoa {
	private Integer idFuncionario;
	
	public Funcionario() {
			
		}
		public Funcionario(String nome, Integer rg, LocalDate dtNasc,
				String cidadeResid, Integer idFuncionario) {
			super.setNome(nome);
			super.setRg(rg);
			super.setDtNasc(dtNasc);
			super.setCidadeResid(cidadeResid);
			this.idFuncionario=idFuncionario;

		}
		public Integer getIdFuncionario() {
			return idFuncionario;
		}
		public void setIdFuncionario(Integer idFuncionario) {
			this.idFuncionario = idFuncionario;
		}

}
