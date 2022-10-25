package model;

public class Hospedagem {
	private Integer numQuarto;
	private Integer numHospedes;
	private Reserva reserva;
	
	public Hospedagem() {
		
	}
	
	public Hospedagem(Integer numQuarto,Integer numHospedes, Reserva reserva 
			) {
		this.numQuarto=numQuarto;
		this.numHospedes=numHospedes;
		this.reserva=reserva;
	}

}
