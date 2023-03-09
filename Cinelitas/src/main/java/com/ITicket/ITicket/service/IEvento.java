
package com.ITicket.ITicket.service;

import com.ITicket.ITicket.entity.Evento;
import java.util.List;



public interface IEvento {
    public List<Evento> getAllEvento();
    public Evento getEventoById (long id);
    public void saveEvento(Evento evento);
    public void delete(long id);


}
