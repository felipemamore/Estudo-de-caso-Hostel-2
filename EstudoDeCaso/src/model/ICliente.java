package model;

import java.util.ArrayList;

public interface ICliente {
	
	public boolean incluir (Cliente cliente);
	public ArrayList<Cliente> listaCliente();
	public boolean atualizar (Cliente cliente);
	public boolean remover (Cliente cliente);
	

}
