package model;

import java.util.ArrayList;

public interface ICliente {
	
	public boolean incluir (Cliente cliente);
	public boolean atualizar (Cliente cliente, Long cpf);
	public boolean remover (Cliente cliente, Long cpf);
	ArrayList<Cliente> tabelaClientes();
	

}
