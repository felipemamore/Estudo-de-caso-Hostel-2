package model;

import java.util.ArrayList;

public interface IReserva {
	public boolean inclui(Reserva reserva);
	public ArrayList<Reserva> listaReserva();
	public boolean atualizar (Reserva reserva);
	public boolean remover (Reserva reserva);

}
