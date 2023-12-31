package com.evento.eventos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.evento.eventos.model.Evento;

import com.evento.eventos.repository.EventoRepository;

@Controller
public class EventoController {

    @Autowired
    private EventoRepository er;
    /* *
    @Autowired
    private ConvidadoRepository cr;*/

    @RequestMapping(value="/cadastrarEvento", method=RequestMethod.GET)
    public String form(){
        return "evento/formEvento";
    }

    @RequestMapping(value="/cadastrarEvento", method=RequestMethod.POST)
    public String form(Evento evento){
        er.save(evento);
        return "redirect:/cadastrarEvento";
    }
    @RequestMapping("/eventos")
    public ModelAndView listarEventos(){
        ModelAndView md = new ModelAndView("index");
        Iterable<Evento> eventos = er.findAll();
        md.addObject("eventos", eventos);
        return md;
    }

    @RequestMapping(value = "/{codigo}",method = RequestMethod.GET)
    public ModelAndView detalheEvento(@PathVariable("codigo") long codigo){
        Evento evento = er.findByCodigo(codigo);
        ModelAndView md = new ModelAndView("evento/detalheEvento");
        md.addObject("evento", evento);
        return md;
    }
    /*
     * metod pra salvar um convidado e inserir na lista 
     */
    /* *
    @RequestMapping(value = "/{codigo}",method = RequestMethod.POST)
    public String detalheEvento(@PathVariable("codigo") long codigo, Convidado convidado){
       Evento evento = er.findByCodigo(codigo);
       convidado.setEvento(evento);
       cr.save(convidado);
        return "redirect:/{codigo}";
    }
    */
}
