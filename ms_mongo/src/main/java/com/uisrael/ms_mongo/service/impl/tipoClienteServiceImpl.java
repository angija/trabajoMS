package com.uisrael.ms_mongo.service.impl;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uisrael.ms_mongo.modell.tipoCliente;
import com.uisrael.ms_mongo.repository.ITipoClienteRepository;
import com.uisrael.ms_mongo.service.ITipoClienteService;

@Service
@Transactional
@Component
public class tipoClienteServiceImpl implements ITipoClienteService {

	
	private ITipoClienteRepository repoT;
	@Override
	public boolean guardarCliente(tipoCliente nuevoTCliente) {
		// TODO Auto-generated method stub
		try {
			return repoT.save(nuevoTCliente) != null;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<tipoCliente> listarTCliente() {
		// TODO Auto-generated method stub
		try {
			return repoT.findAll();
		} catch (Exception e) {
			throw e;
		}
	}

	
}
