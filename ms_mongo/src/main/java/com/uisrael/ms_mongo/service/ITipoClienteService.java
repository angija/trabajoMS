package com.uisrael.ms_mongo.service;

import java.util.List;


import com.uisrael.ms_mongo.modell.tipoCliente;

public interface ITipoClienteService {

public boolean guardarCliente(tipoCliente nuevoTCliente);
	
	public List<tipoCliente> listarTCliente();
}
