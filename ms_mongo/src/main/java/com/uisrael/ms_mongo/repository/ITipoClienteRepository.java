package com.uisrael.ms_mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.uisrael.ms_mongo.modell.tipoCliente;

@Repository
public interface ITipoClienteRepository extends MongoRepository<tipoCliente, String>{

}
