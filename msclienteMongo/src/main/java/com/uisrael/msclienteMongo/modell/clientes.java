package com.uisrael.msclienteMongo.modell;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "clientes")
@Getter
@Setter
@NoArgsConstructor
public class clientes {

	@Id
	private String idCliente;
	private String nombre;
	private String apellido;
	private String direccion;
	private boolean estadoCliente;
}
