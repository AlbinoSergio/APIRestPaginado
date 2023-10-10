package com.example.apirest.controllers;

import com.example.apirest.entities.Persona;
import com.example.apirest.services.PersonaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl<Persona,PersonaServiceImpl>{

}
