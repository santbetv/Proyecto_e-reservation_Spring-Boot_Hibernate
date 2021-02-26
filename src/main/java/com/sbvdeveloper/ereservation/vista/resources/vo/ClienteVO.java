/**
 * 
 */
package com.sbvdeveloper.ereservation.vista.resources.vo;

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
//@Data
public class ClienteVO {
	private String nombre;
	private String apellido;
	private String identificacion;
	private String telefono;
	private String email;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
