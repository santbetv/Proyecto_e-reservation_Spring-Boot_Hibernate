/**
 * 
 */
package com.sbvdeveloper.ereservation.modelo;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

/**
 * 
 * @author Santiago Betancur
 * @email  santiago-betancur@hotmail.com
 */
//Se trabaja con lombok
@Data
@Entity
@Table(name = "cliente")
@NamedQuery(name="Cliente.findByIdentificacion", query="Select c from Cliente c where c.identificacion = ?1")
public class Cliente {
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String idCliente;
	private String nombre;
	private String apellido;
	private String identificacion;
	private String telefono;
	private String email;
	@OneToMany(mappedBy = "cliente")
	private Set<Reserva> reservas;
	
	
	public Cliente() {
		
	}
	
	

}
