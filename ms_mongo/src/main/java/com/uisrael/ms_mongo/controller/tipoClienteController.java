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

import com.uisrael.ms_mongo.modell.tipoCliente;
import com.uisrael.ms_mongo.service.ITipoClienteService;

import lombok.Getter;
import lombok.Setter;

@RestController
@RequestMapping("/api/tipocliente")
@Getter
@Setter
@RefreshScope
public class tipoClienteController {

	@Autowired
	private ITipoClienteService serviT;

	@GetMapping("/listadotcliente")
	public List<tipoCliente> leerContenidoTCliente() {
		return this.serviT.listarTCliente();
	}

	@PostMapping("/insertartcliente")
	public void insertarTipoCliente(@RequestBody tipoCliente nuevoTCliente) {
		serviT.guardarCliente(nuevoTCliente);
	}

	@Value("${app.testPropiedad}")
	private String testPropiedad;

	@GetMapping("/test")
	public String leerContenidoTestPropiedad() {
		return this.testPropiedad;
	}
}
