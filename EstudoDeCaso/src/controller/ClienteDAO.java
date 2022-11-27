package controller;

import java.util.ArrayList;

import model.Cliente;
import model.ICliente;

public class ClienteDAO implements ICliente{
	
	private static ArrayList<Cliente> tabelaClientes;
	private static ClienteDAO instancia;
	
	private ClienteDAO() {
		
	}
	
	public static ClienteDAO getInstancia() {
		if (instancia == null) {
			instancia = new ClienteDAO();
			tabelaClientes = new ArrayList<>();
		}
		return instancia; 
	}

	@Override
	public boolean incluir(Cliente cliente) {
		// TODO Auto-generated method stub
		
		if(cliente != null) {
			tabelaClientes.add(cliente);
		}
		return false;
	}
	

	@Override
	public boolean atualizar(Cliente cliente, Long cpf) {
		// TODO Auto-generated method stub
		for (Cliente c:tabelaClientes) {
			if(c.getCpf()== cpf) {
				c.setNome(cliente.getNome());
				return true;
			}
			
		}
		return false;
	}

	@Override
	public boolean remover(Cliente cliente, Long cpf) {
		// TODO Auto-generated method stub
		for (Cliente c:tabelaClientes) {
			if(c.getCpf()== cpf) {
				tabelaClientes.remove(c);
				return true;
			}
		}
		return false;
	}
	@Override
	public ArrayList<Cliente> tabelaClientes() {
		// TODO Auto-generated method stub
		return tabelaClientes;
	}
	

}
