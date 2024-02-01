package com.uisrael.ms_mongo.service;

import java.util.List;

import com.uisrael.ms_mongo.modell.cliente;

public interface IClienteService {

	public boolean guardarCliente(cliente nuevoCliente);
	
	public List<cliente> listarCliente();
}
