package com.uisrael.msclienteMongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.uisrael.msclienteMongo.modell.clientes;
import com.uisrael.msclienteMongo.service.IClienteService;

import lombok.Getter;
import lombok.Setter;

@RestController
@RequestMapping("/api/cliente")
@Getter
@Setter
@RefreshScope
public class clienteController {

	@Autowired
	private IClienteService servi;
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void guardarCliente(@RequestBody clientes ncliente) {
		
		servi.guardarCliente(ncliente);
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<clientes> listarClientes(){
		return servi.listarCliente();
	}
	
	@GetMapping("/listadoC")
	public List<clientes> listadoCliente(){
		
		return servi.listarCliente();
	}
	
	@PostMapping("/insertarC")
	public void insertarCliente(@RequestBody clientes newcliente) {
		servi.guardarCliente(newcliente);
	}
	
}
