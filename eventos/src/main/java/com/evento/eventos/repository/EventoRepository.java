package com.evento.eventos.repository;

import org.springframework.data.repository.CrudRepository;

import com.evento.eventos.model.Evento;



public interface EventoRepository extends CrudRepository<Evento, String>{

    Evento  findByCodigo(long codigo);
    
}
