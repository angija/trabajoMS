package com.uisrael.msclienteMongo.service;

import java.util.List;

import com.uisrael.msclienteMongo.modell.clientes;

public interface IClienteService {

	public boolean guardarCliente(clientes nuevoCliente);
	
	public List<clientes> listarCliente();
}
