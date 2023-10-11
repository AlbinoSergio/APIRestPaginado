package com.example.apirest.services;

import com.example.apirest.entities.Persona;

import java.util.List;

public interface PersonaService extends BaseService<Persona,Long>{

    List<Persona> search(String filtro) throws Exception;
}
