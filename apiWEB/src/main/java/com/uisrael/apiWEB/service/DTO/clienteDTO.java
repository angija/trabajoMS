package com.uisrael.apiWEB.service.DTO;

import lombok.Data;

@Data
public class clienteDTO {

	private String idCliente;
	private String nombre;
	private String apellido;
	private String direccion;
	private boolean estadoCliente;
}
