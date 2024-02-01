package com.uisrael.msclienteMongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.uisrael.msclienteMongo.modell.clientes;

public interface IClienteRepository extends MongoRepository<clientes, String> {

}
