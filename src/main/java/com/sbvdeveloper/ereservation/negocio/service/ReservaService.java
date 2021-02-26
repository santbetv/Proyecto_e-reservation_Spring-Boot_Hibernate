/**
 * 
 */
package com.sbvdeveloper.ereservation.negocio.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sbvdeveloper.ereservation.entity.Cliente;
import com.sbvdeveloper.ereservation.entity.Reserva;
import com.sbvdeveloper.ereservation.negocio.repository.ReservaRepository;

/**
 * El servicio lo que hace es que consume los metodos definidos en un
 * repositorio y los expone a través de un servicio para utilizar con el
 * FrontEnd
 * 
 * 
 * Clase para definir los servicios del reserva
 * 
 * @author Santiago Betancur
 * @email santiago-betancur@hotmail.com
 *
 */

@Service
@Transactional(readOnly = true)
public class ReservaService {

	@Autowired
	private  ReservaRepository reservaRepository;

	/**
	 * Método para realizar la operación de guardar una reserva
	 * 
	 * @param reserva
	 * @return
	 */
	@Transactional
	public Reserva create(Reserva reserva) {
		return this.reservaRepository.save(reserva);
	}

	/**
	 * Método para realizar la operación de actualizar una reserva
	 * 
	 * @param reserva
	 * @return
	 */
	@Transactional
	public Reserva update(Reserva reserva) {
		return this.reservaRepository.save(reserva);
	}

	/**
	 * Método para realizar la operación de eliminar una reserva
	 * 
	 * @param reserva
	 */
	@Transactional
	public void delete(Reserva reserva) {
		this.reservaRepository.delete(reserva);
	}

	/**
	 * Método para consultar todos las reservas
	 * 
	 * @return
	 */
	public List<Reserva> findAll() {
		return this.reservaRepository.findAll();
	}

	/**
	 * Método para consultar las reservas por un cliente en específico
	 * 
	 * @param cliente
	 * @return
	 */
	public List<Reserva> findByCliente(Cliente cliente) {
		return this.reservaRepository.findByCliente(cliente);
	}

	/**
	 * Método para consultar las reservas por la fecha de ingreso en base a un rango
	 * de fechas
	 * 
	 * @param fechaInicio
	 * @param fechaSalida
	 * @return
	 */
	public List<Reserva> find(Date fechaInicio, Date fechaSalida) {
		return this.reservaRepository.find(fechaInicio, fechaSalida);
	}

	/**
	 * Método para consultar una reserva por su código de reserva
	 * 
	 * @param codigoReserva
	 * @return
	 */
	public Reserva findByCodigoReserva(String codigoReserva) {
		return this.reservaRepository.findByCodigoReserva(codigoReserva);
	}

}
