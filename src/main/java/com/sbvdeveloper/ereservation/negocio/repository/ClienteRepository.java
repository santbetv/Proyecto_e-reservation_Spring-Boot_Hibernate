/**
 * 
 */
package com.sbvdeveloper.ereservation.negocio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sbvdeveloper.ereservation.entity.Cliente;

/**
 * 
 * Interface para definir las operaciones de bd con el cliente
 * 
 * @author Santiago Betancur
 * @email santiago-betancur@hotmail.com
 * 
 */
public interface ClienteRepository extends JpaRepository<Cliente, String> {

	/**
	 * 1. primer forma para buscar clientes
	 * Definición de método para buscar los clientes por su apellido
	 * colocando al inicio findBy -> palabra reservada
	 * 
	 * @param apellidoCli
	 * @return
	 */
	public List<Cliente> findByApellido(String apellido);

	/**
	 * 2. segunda forma de buscar validar en la clase se coloca el query de busqueda, llamado este metodo
	 * en este caso si require una consulta con mas And se vuelve mas extenso despues de cada nombre de atributo
	 * colocar and y otro atibuto, ejemplo findByIdentificacionAndnombreAnd... Asi.
	 * Definición de método para buscar un cliente por su identificación
	 * 
	 * @param identificacionCli
	 * @return
	 */
	public Cliente findByIdentificacion(String identificacion);

	/**
	 * 3. Consulta mas especializada para la busqueda
	 * Definición de método para buscar un cliente por su cuenta de email
	 * 
	 * @param email
	 * @return
	 */
	@Query("Select c from Cliente c where c.email like %:email")
	public Cliente findByEmailAccount(@Param("email") String email);

}
