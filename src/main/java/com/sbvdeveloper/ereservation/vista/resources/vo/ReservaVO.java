/**
 * 
 */
package com.sbvdeveloper.ereservation.vista.resources.vo;

import java.util.Date;

import lombok.Data;

/**
 * Clase que sirve para intercambiar información, que sea libre, sin atarse a
 * ninguna tecnología
 * 
 * @author Santiago Betancur
 * @email santiago-betancur@hotmail.com
 */
//Se trabaja con lombok
//@Data
public class ReservaVO {
	private String codigoReserva;
	private Date fechaIngreso;
	private Date fechaSalida;
	private int cantidadPersonas;
	private String descripcion;
	private ClienteVO cliente;

	public String getCodigoReserva() {
		return codigoReserva;
	}

	public void setCodigoReserva(String codigoReserva) {
		this.codigoReserva = codigoReserva;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Date getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public int getCantidadPersonas() {
		return cantidadPersonas;
	}

	public void setCantidadPersonas(int cantidadPersonas) {
		this.cantidadPersonas = cantidadPersonas;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public ClienteVO getCliente() {
		return cliente;
	}

	public void setCliente(ClienteVO cliente) {
		this.cliente = cliente;
	}

}