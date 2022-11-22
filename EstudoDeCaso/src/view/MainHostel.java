package view;

import java.time.LocalDate;
import java.util.Scanner;

import controller.ClienteDAO;
import model.Cliente;
import model.Funcionario;
import model.Pessoa;

public class MainHostel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer opcao = Integer.MAX_VALUE;
		Scanner leitura = new Scanner(System.in);
		ClienteDAO clienteDAO = ClienteDAO.getInstancia();
		while (opcao != 0) {
			System.out.println("-----MENU-----");
			System.out.println("0 - SAIR");
			System.out.println("1 - INCLUIR");
			System.out.println("2 - ATUALIZAR");
			System.out.println("3 - REMOVER");
			System.out.println("4 - LISTAR TODOS");
			System.out.println("---------------");
			opcao = Integer.valueOf(leitura.nextLine());

			switch (opcao) {
			case 0:
				break;

			case 1:
				Cliente cliente = new Cliente();
				System.out.println("Nome do cliente: ");
				String nome = leitura.nextLine();
				if (!nome.isEmpty()) {
					cliente.setNome(nome);
				} else {
					System.out.println("Nome invalido !");
				}
				System.out.println("CPF do cliente");
				String cpf = leitura.nextLine();
				if (!cpf.isEmpty()) {
					cliente.setCpf(Long.valueOf(cpf));
				} else {
					System.out.println("CPF Invalido !");
				}
				clienteDAO.incluir(cliente);
				
			}

		}
		Cliente cliente = new Cliente();
		cliente.setNome("Novo cliente");
		cliente.setRg(121334);
		cliente.setDtNasc(LocalDate.of(1997, 1, 8));
		cliente.setCidadeResid("Gaspar");

		Pessoa pessoa = (Cliente) cliente;

		if (pessoa instanceof Cliente) {
			System.out.println("Temos um cliente");

		} else if (pessoa instanceof Funcionario) {
			System.out.println("Temos um funcionario");

		}

	}

}
