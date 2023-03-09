
package com.ITicket.ITicket.service;

import com.ITicket.ITicket.entity.Evento;
import com.ITicket.ITicket.repository.EventoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventoService implements IEvento{
  
     @Autowired
    private EventoRepository eventorepository;
    
    @Override
    public void delete(long id) {
        eventorepository.deleteById(id);
    }

    @Override
    public List<Evento> getAllEvento() {
        return (List<Evento>)eventorepository.findAll();
    }

    @Override
    public Evento getEventoById(long id) {
        return eventorepository.findById(id).get();
    }

    @Override
    public void saveEvento(Evento evento) {
        eventorepository.save(evento);
    }
    
}
