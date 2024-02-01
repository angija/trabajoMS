package com.uisrael.apiWEB.service;

import java.util.List;


import com.uisrael.apiWEB.service.DTO.clienteDTO;


public interface IClienteService {

	public List<clienteDTO> listarCliente();
	
	public boolean insertarCliente(clienteDTO clientes);
}
