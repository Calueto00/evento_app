package com.evento.eventos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="convidados")
public class Convidado {

    @Id
    private String bi;
    
    private String nomeConvidado;

   @ManyToOne
    private Evento evento;

    public String getBi() {
        return bi;
    }
    public void setBi(String bi) {
        this.bi = bi;
    }
    public Evento getEvento() {
    return evento;
    }
    public void setEvento(Evento evento) {
        this.evento = evento;
    }
    
    public String getNomeConvidado() {
        return nomeConvidado;
    }
    public void setNomeConvidado(String nomeConvidado) {
        this.nomeConvidado = nomeConvidado;
    }


}
