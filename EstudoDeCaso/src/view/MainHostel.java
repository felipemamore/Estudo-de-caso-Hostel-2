package view;

import java.time.LocalDate;

import model.Cliente;
import model.Funcionario;
import model.Pessoa;

public class MainHostel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente();
		cliente.setNome("Novo cliente");
		cliente.setRg(121334);
		cliente.setDtNasc(LocalDate.of(1997, 1, 8));
		cliente.setCidadeResid("Gaspar");
		
		Pessoa pessoa =  (Cliente) cliente;
		
		if (pessoa instanceof Cliente) {
			System.out.println("Temos um cliente");
			
		} else if (pessoa instanceof Funcionario) {
			System.out.println("Temos um funcionario");
			
		}
		

	}

}
