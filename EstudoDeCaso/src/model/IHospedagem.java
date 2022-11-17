package model;

import java.util.ArrayList;

public interface IHospedagem {
	public boolean inclui(Hospedagem hospedagem);
	public ArrayList<Hospedagem> listaHospedagem();
	public boolean atualizar (Hospedagem hospedagem);
	public boolean remover (Hospedagem hospedagem);

}
