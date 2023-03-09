
package com.ITicket.ITicket.service;

import com.ITicket.ITicket.entity.Precio;
import com.ITicket.ITicket.repository.PrecioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrecioService implements IPrecio{
     @Autowired 
    private PrecioRepository preciorepository;
    
    
    @Override
    public List<Precio> listCountry() {
      return (List<Precio>)preciorepository.findAll();
    }
}
