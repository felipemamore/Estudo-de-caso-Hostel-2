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

	public Integer getNumQuarto() {
		return this.numQuarto;
	}

	public void setNumQuarto(Integer numQuarto) {
		this.numQuarto = numQuarto;
	}

	public Integer getNumHospedes() {
		return this.numHospedes;
	}

	public void setNumHospedes(Integer numHospedes) {
		this.numHospedes = numHospedes;
	}

	public Reserva getReserva() {
		return this.reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

}
