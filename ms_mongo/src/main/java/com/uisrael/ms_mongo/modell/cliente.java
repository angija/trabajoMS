package com.uisrael.ms_mongo.modell;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Document(collection = "cliente")
@Getter
@Setter
@NoArgsConstructor
public class cliente {

	@Id
	private String idCliente;
	private String nombreCliente;
	private String apellidoCliente;
	private String dniCliente;
	private String direccionCliente;
	private boolean estadoCliente;
}
