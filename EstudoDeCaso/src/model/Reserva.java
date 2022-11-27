package model;

import java.time.LocalDate;
import java.util.Random;

public class Reserva {
	private Random codigo;
	private LocalDate dtInicio;
	private LocalDate dtFim;
	private Cliente cliente;
	private Funcionario funcionario;
	
	public Reserva() {
		
	}
	public Reserva(LocalDate dtInicio, LocalDate dtFim,
			Cliente cliente, Funcionario funcionario
			){
		this.dtInicio=dtInicio;
		this.dtFim=dtFim;
		this.cliente=cliente;
		this.funcionario=funcionario;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public Random getCodigo() {
		return codigo;
	}
	public void setCodigo(Random codigo) {
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
