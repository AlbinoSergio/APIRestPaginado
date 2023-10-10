package com.example.apirest.repositories;

import com.example.apirest.entities.Libro;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends BaseRepository<Libro, Long> {

}
