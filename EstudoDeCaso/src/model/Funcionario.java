package model;

import java.time.LocalDate;
import java.util.Random;

public class Funcionario extends Pessoa {
	private Random idFuncionario;
	
	public Funcionario() {
			
		}
		public Funcionario(Random idFuncionario, String nome, Integer rg, LocalDate dtNasc,
				String cidadeResid) {
			this.idFuncionario=idFuncionario;
			super.setNome(nome);
			super.setRg(rg);
			super.setDtNasc(dtNasc);
			super.setCidadeResid(cidadeResid);
			

		}
		public Random getIdFuncionario() {
			return idFuncionario;
		}
		public void setIdFuncionario(Random idFuncionario) {
			this.idFuncionario = idFuncionario;
		}

}
