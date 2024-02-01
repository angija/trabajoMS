package com.uisrael.apiWEB.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.uisrael.apiWEB.service.IClienteService;
import com.uisrael.apiWEB.service.DTO.clienteDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
@Component
public class clienteServiceImpl implements IClienteService {

	@Autowired
	private RestTemplate gestionRest;
	
	@Override
	public List<clienteDTO> listarCliente() {
		try {
			String clienteJson = gestionRest.getForObject("http://localhost:58394/api/cliente/listadoC",
					String.class);
			ObjectMapper objectMapper = new ObjectMapper();
			return objectMapper.readValue(clienteJson, new TypeReference<List<clienteDTO>>() {
			});
		} catch (Exception e) {
			e.printStackTrace();
			// Handle the error appropriately
		}
		return new ArrayList<>();
	}

	@Override
	public boolean insertarCliente(clienteDTO clientes) {
		// TODO Auto-generated method stub
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			String nuevoClienteJson = objectMapper.writeValueAsString(clientes);
			String response = gestionRest.postForObject("http://localhost:58394/api/cliente/insertarC", nuevoClienteJson, String.class);
			return response != null;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

}
