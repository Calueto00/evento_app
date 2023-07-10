package com.evento.eventos.repository;

import org.springframework.data.repository.CrudRepository;

import com.evento.eventos.model.Convidado;

public interface ConvidadoRepository extends CrudRepository<Convidado, String>{
    
}
