package com.uisrael.ms_mongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uisrael.ms_mongo.modell.cliente;
import com.uisrael.ms_mongo.service.IClienteService;

import lombok.Getter;
import lombok.Setter;

@RestController
@RequestMapping("/api/cliente")
@Getter
@Setter
@RefreshScope
public class clienteController {

	@Autowired
	private IClienteService serviC;
	
	@GetMapping("/listadoCliente")
	public List<cliente> leerContenidoCliente(){
		return this.serviC.listarCliente();
	}
	
	@PostMapping("/insertarcliente")
	public void insertarCliente(@RequestBody cliente nuevoCliente) {
		serviC.guardarCliente(nuevoCliente);
	}
	
	@Value("${app.testPropiedad}")
	private String testPropiedad;
	
	@GetMapping("/test")
	public String leerContenidoTestPropiedad() {
		return this.testPropiedad;
	}
}
