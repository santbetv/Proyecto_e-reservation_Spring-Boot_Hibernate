/**
 * 
 */
package com.sbvdeveloper.ereservation.vista.resources;

import lombok.Data;

/**
 * 
 * Clase que sivre para intercambiar información, que sea libre, sin atarse a
 * ninguna tecnología
 * 
 * @author Santiago Betancur
 * @email santiago-betancur@hotmail.com
 */
//Se trabaja con lombok
@Data
public class ClienteVO {
	private String nombre;
	private String apellido;
	private String identificacion;
	private String telefono;
	private String email;
}
