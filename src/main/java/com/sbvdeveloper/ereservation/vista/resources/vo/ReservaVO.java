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
@Data
public class ReservaVO {
	private String codigoReserva;
	private Date fechaIngreso;
	private Date fechaSalida;
	private int cantidadPersonas;
	private String descripcion;
	private ClienteVO cliente;
}