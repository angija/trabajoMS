package com.uisrael.msclienteMongo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uisrael.msclienteMongo.modell.clientes;
import com.uisrael.msclienteMongo.repository.IClienteRepository;
import com.uisrael.msclienteMongo.service.IClienteService;

@Service
public class clienteServiceImpl implements IClienteService{

	@Autowired
	private IClienteRepository repo;
	
	

	@Override
	public List<clientes> listarCliente() {
		// TODO Auto-generated method stub
		try {
			return repo.findAll();
		} catch (Exception e) {
			throw e;
		}
	}



	@Override
	public boolean guardarCliente(clientes nuevoCliente) {
		// TODO Auto-generated method stub
		try {
			return repo.save(nuevoCliente) != null;
		} catch (Exception e) {
			throw e;
		}
	}

}
