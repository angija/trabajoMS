package com.uisrael.ms_mongo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uisrael.ms_mongo.modell.cliente;
import com.uisrael.ms_mongo.repository.IClienteRepository;
import com.uisrael.ms_mongo.service.IClienteService;

@Service
@Transactional
@Component
public class clienteServiceImpl implements IClienteService{

	@Autowired
	private IClienteRepository repoC;
	@Override
	public boolean guardarCliente(cliente nuevoCliente) {
		try {
			return repoC.save(nuevoCliente) != null;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<cliente> listarCliente() {
		// TODO Auto-generated method stub
		try {
			return repoC.findAll();
		} catch (Exception e) {
			throw e;
		}
	}

	
}
