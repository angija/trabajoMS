package com.uisrael.ms_mongo.modell;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "tipoCliente")
@Getter
@Setter
@NoArgsConstructor
public class tipoCliente {

	@Id
	private String idTCliente;
	private String detalleTipoCliente;
	private boolean estadoCliente;
}
