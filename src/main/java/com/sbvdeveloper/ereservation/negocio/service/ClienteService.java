package com.sbvdeveloper.ereservation.negocio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sbvdeveloper.ereservation.modelo.Cliente;
import com.sbvdeveloper.ereservation.negocio.repository.ClienteRepository;

/**
 * 
 * El servicio lo que hace es que consume los metodos definidos en un repositorio y
 * los expone a través de un servicio para utilizar con el FrontEnd
 * 
 * 
 * Clase para definir los servicios del cliente
 * 
 * @author Santiago Betancur
 * @email santiago-betancur@hotmail.com
 *
 */
@Service
@Transactional(readOnly = true)//principos de ACID
public class ClienteService {

	
	private final ClienteRepository clienteRepository;

	@Autowired
	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	/**
	 * Método para realizar la operación de guardar un cliente
	 * 
	 * @param cliente
	 * @return
	 */
	@Transactional
	public Cliente create(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}

	/**
	 * Método para realizar la operación de actualizar un cliente
	 * 
	 * @param cliente
	 * @return
	 */
	@Transactional
	public Cliente update(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}

	/**
	 * Método para realizar la operación de eliminar un cliente
	 * 
	 * @param cliente
	 */
	@Transactional
	public void delete(Cliente cliente) {
		this.clienteRepository.delete(cliente);
	}

	/**
	 * Método para consultar un cliente por su identificación
	 * 
	 * @param identificacionCli
	 * @return
	 */
	public Cliente findByIdentificacion(String identificacion) {
		return this.clienteRepository.findByIdentificacion(identificacion);
	}

	public List<Cliente> findAll() {
		return this.clienteRepository.findAll();

	}

}
