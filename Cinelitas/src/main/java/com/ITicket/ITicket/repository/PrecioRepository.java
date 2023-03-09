
package com.ITicket.ITicket.repository;

import com.ITicket.ITicket.entity.Evento;
import com.ITicket.ITicket.entity.Precio;
import org.springframework.data.repository.CrudRepository;


public interface PrecioRepository extends CrudRepository<Precio,Long>{
    
}
