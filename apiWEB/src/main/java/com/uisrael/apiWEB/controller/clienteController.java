package com.uisrael.apiWEB.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.uisrael.apiWEB.service.IClienteService;
import com.uisrael.apiWEB.service.DTO.clienteDTO;


@Controller
public class clienteController {

	@Autowired
	private IClienteService serviC;
	
	@GetMapping("/ms/listadoClienteMongo")
	public String ListarCliente(Model model) {
	
		List<clienteDTO> resultado = serviC.listarCliente();
		
		model.addAttribute("listaC", resultado);
		
		return "/clienteMongo/listadoClienteM";
			
	}
	
	@GetMapping("/ms/nuevoClienteMongo")
	public String abrirNuevoCliente(Model model) {
		
		model.addAttribute("nuevoC" , new clienteDTO());
		
		return "/clienteMongo/guardarClienteM";
	}
	
	@PostMapping("/guardarC")
	public String guardarCliente (@ModelAttribute("nuevoC") clienteDTO nuevoCliente) {
		
		serviC.insertarCliente(nuevoCliente);
		
		return "redirect:/ms/listadoClienteMongo";
	}
}
