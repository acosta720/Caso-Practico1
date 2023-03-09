
package com.ITicket.ITicket.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="evento")
public class Evento implements Serializable{
     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String fecha;
    private String lugar;
    private String capacidad;
 

      @ManyToOne
      @JoinColumn(name="precio_id")
     private Precio precio;
      
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public Precio getPrecio() {
        return precio;
    }

    public void setPrecio(Precio precio) {
        this.precio = precio;
    }
   
    
}
