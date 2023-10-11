package com.example.apirest.repositories;

import com.example.apirest.entities.Persona;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {

    //Anotacion metodo Query

    List<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido);

    boolean existsByDni (int dni);
    //Anotacion JPQL parametros indexados
    @Query (value = "SELECT p FROM Persona p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")
    List<Persona> search(@Param("filtro")String filtro);

    @Query (
            value = "SELECT * FROM persona WHERE persona.nombre LIKE %:filtro% OR persona.apellido LIKE %:filtro%",
            nativeQuery = true
    )
    List<Persona> searchNativo(@Param("filtro") String filtro);

}
