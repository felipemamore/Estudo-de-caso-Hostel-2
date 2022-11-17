package model;

import java.util.ArrayList;

public interface IFuncionario {
	public boolean inclui(Funcionario funcionario);
	public ArrayList<Funcionario> listaFuncionario();
	public boolean atualizar (Funcionario funcionario);
	public boolean remover (Funcionario funcionario);
	

}
