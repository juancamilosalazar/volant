package com.example.volant.volant.controller;

import com.example.volant.volant.business.ReservaBusiness;
import com.example.volant.volant.model.Pasajero;
import com.example.volant.volant.model.Reserva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/reserva")
public class ReservaController {
    @Autowired
    private ReservaBusiness business;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Reserva> getAll() {
        return business.findAll();
    }

    @RequestMapping(value = "/{codigo}", method = RequestMethod.GET)
    public Reserva getPetByCodigoReserva(@PathVariable("codigo") String codigo) {
        return business.findByCodigoReserva(codigo);
    }
    @RequestMapping(value = "addPasajero/{codigo}", method = RequestMethod.POST)
    public Reserva addPasajero(@RequestBody Pasajero pasajero,@PathVariable("codigo") String codigoReserva){
        return business.addPasajero(pasajero,codigoReserva);
    }
    @RequestMapping(value = "addReserva", method = RequestMethod.POST)
    public Reserva addPasajero(@RequestBody Reserva reserva){
        return business.createReserva(reserva);
    }
}
