package view;

import java.time.LocalDate;
import java.util.ArrayList;
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
			System.out.println("+--------------------------------------+");
			System.out.println("|                 MENU                 |");
			System.out.println("+--------------------------------------+");
			System.out.println("|0 - SAIR                              |");
			System.out.println("|1 - INCLUIR			       |");
			System.out.println("|2 - ATUALIZAR                         |");
			System.out.println("|3 - REMOVER                           |");
			System.out.println("|4 - LISTAR TODOS                      |");
			System.out.println("|--------------------------------------|");
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
				System.out.println("rg do cliente");
				String rg = leitura.nextLine();
				if (!rg.isEmpty()) {
					cliente.setRg(Integer.valueOf(rg));
				} else {
					System.out.println("RG Invalido !");
				}
				cliente.setDtNasc(LocalDate.of(1997, 8, 1));
				System.out.println("Cidade do cliente:");
				String cidade = leitura.nextLine();
				cliente.setCidadeResid(cidade);
				System.out.println("CPF do cliente");
				String cpf = leitura.nextLine();
				if (!cpf.isEmpty()) {
					cliente.setCpf(Long.valueOf(cpf));
				} else {
					System.out.println("Cpf invalido !");
				}
				System.out.println("Email do clinte");
				String email = leitura.nextLine();
				cliente.setEmail(email);
				System.out.println("Telefone do cliente");
				String telefone = leitura.nextLine();
				cliente.setTelefone(Integer.valueOf(telefone));
				System.out.println("Qtde de ocupacoes");
				String qtde = leitura.nextLine();
				cliente.setQtdeOcupacoes(Integer.valueOf(qtde));
				clienteDAO.incluir(cliente);
				break;

			case 2:
				
				System.out.println("CPF do cliente a ser alterado:");
				Long cpfAltera = Long.valueOf(leitura.nextLine());
				
				for(Cliente c: ClienteDAO.getInstancia().tabelaClientes()) {
					if (c.getCpf()== cpfAltera) {
						ClienteDAO.getInstancia().tabelaClientes();
						ClienteDAO.getInstancia().atualizar(c, cpfAltera);
						System.out.println("Altere o cliente:");
						String nomeCliente = leitura.nextLine();
						c.setNome(nomeCliente);

					}
				}

				

			case 3:
				System.out.println("CPF do cliente a ser excluido:");
				Long cpfExclui = Long.valueOf(leitura.nextLine());
				
				for(Cliente c: ClienteDAO.getInstancia().tabelaClientes()) {
					if(c.getCpf() == cpfExclui) {
						ClienteDAO.getInstancia().remover(c, cpfExclui);
						System.out.println("Cliente excluido");
						break;
					}else {
						System.out.println("CPF invalido !");
					}
				}
				break;
			case 4:

				ArrayList<Cliente> lista = ClienteDAO.getInstancia().tabelaClientes();
				for (Cliente c : lista) {
					System.out.println(c.toString());
				}

			}

		}

	}

}
