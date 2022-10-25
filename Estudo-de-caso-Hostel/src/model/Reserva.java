package model;

import java.time.LocalDate;

public class Reserva{
	private Integer codigo;
	private LocalDate dtInicio;
	private LocalDate dtFim;
	private Cliente cliente;
	
	public Reserva() {
		
	}
	public Reserva(Integer codigo, LocalDate dtInicio, LocalDate dtFim,
			Cliente cliente
			){
		this.codigo=codigo;
		this.dtInicio=dtInicio;
		this.dtFim=dtFim;
		this.cliente=cliente;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public LocalDate getDtInicio() {
		return dtInicio;
	}
	public void setDtInicio(LocalDate dtInicio) {
		this.dtInicio = dtInicio;
	}
	public LocalDate getDtFim() {
		return dtFim;
	}
	public void setDtFim(LocalDate dtFim) {
		this.dtFim = dtFim;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
