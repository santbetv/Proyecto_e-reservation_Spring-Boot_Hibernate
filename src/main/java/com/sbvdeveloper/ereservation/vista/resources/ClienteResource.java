/**
 * 
 */
package com.sbvdeveloper.ereservation.vista.resources;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sbvdeveloper.ereservation.modelo.Cliente;
import com.sbvdeveloper.ereservation.negocio.service.ClienteService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * 
 * Clase que representa el servicio web de cliente
 * 
 * @author Santiago Betancur
 * @email santiago-betancur@hotmail.com
 * 
 *
 */
@RestController
@RequestMapping("/api/cliente")
@Api(tags = "cliente")
public class ClienteResource {

	private final ClienteService clienteService;

	public ClienteResource(ClienteService clienteService) {
		this.clienteService = clienteService;
	}

	@PostMapping
	@ApiOperation(value = "Crear cliente", notes = "Servicio para crear un nuevo cliente")//Como se idetifica para documentar el codigo
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Cliente creado correctamente"),
			@ApiResponse(code = 404, message = "Solicitd Inválida") })
	public ResponseEntity<Cliente> createCliente(@RequestBody ClienteVO clienteVo) {
		Cliente cliente = new Cliente();
		cliente.setNombre(clienteVo.getNombre());
		cliente.setApellido(clienteVo.getApellido());
		cliente.setIdentificacion(clienteVo.getIdentificacion());
		cliente.setTelefono(clienteVo.getTelefono());
		cliente.setEmail(clienteVo.getEmail());
		return new ResponseEntity<>(this.clienteService.create(cliente), HttpStatus.CREATED);
	}

	@PutMapping("/{idetificacion}")
	@ApiOperation(value = "Actualizar cliente", notes = "Servicio para actualizar un cliente")//Como se idetifica para documentar el codigo
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Cliente actualizado correctamente"),
			@ApiResponse(code = 404, message = "Cliente no encontrado") })
	public ResponseEntity<Cliente> updateCliente(@PathVariable("idetificacion") String idetificacion,
			ClienteVO clienteVo) {
		Cliente cliente = this.clienteService.findByIdentificacion(idetificacion);
		if (cliente == null) {
			return new ResponseEntity<Cliente>(HttpStatus.NOT_FOUND);
		} else {
			cliente.setNombre(clienteVo.getNombre());
			cliente.setApellido(clienteVo.getApellido());
			cliente.setIdentificacion(clienteVo.getIdentificacion());
			cliente.setTelefono(clienteVo.getTelefono());
			cliente.setEmail(clienteVo.getEmail());
		}

		return new ResponseEntity<>(this.clienteService.update(cliente), HttpStatus.OK);
	}

	@DeleteMapping("/{identificacion}")
	@ApiOperation(value = "Eliminar cliente", notes = "Servicio para eliminar un cliente")//Como se idetifica para documentar el codigo
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Cliente eliminado correctamente"),
			@ApiResponse(code = 404, message = "Cliente no eliminado") })
	public void removeCliente(@PathVariable("identificacion") String identificacion) {
		Cliente cliente = this.clienteService.findByIdentificacion(identificacion);
		if (cliente != null) {
			this.clienteService.delete(cliente);
		}
	}

	@GetMapping
	@ApiOperation(value = "Listar clientes", notes = "Servicio para listar todos los clientes")//Como se idetifica para documentar el codigo
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Clientes encontrados"),
			@ApiResponse(code = 404, message = "Cliente no encontrados") })
	public ResponseEntity<List<Cliente>> findAll() {
		return ResponseEntity.ok(this.clienteService.findAll());
	}
}
