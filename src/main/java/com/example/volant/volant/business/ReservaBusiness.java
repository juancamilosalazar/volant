package com.example.volant.volant.business;

import com.example.volant.volant.model.Pasajero;
import com.example.volant.volant.model.Reserva;
import com.example.volant.volant.service.impl.ReservaServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Component
public class ReservaBusiness {
    @Autowired
    ReservaServiceImpl reservaService;

    @Autowired
    ModelMapper modelMapper;

    public List<Reserva> findAll (){
        return reservaService.findAll();
    }
    public Reserva findByCodigoReserva(String codigo){
        return reservaService.findByCodigo(codigo);
    }


    public Reserva addPasajero(Pasajero pasajero, String codigoReserva) {
        Reserva reserva =  reservaService.findByCodigo(codigoReserva);
        reserva.getDocumentosPasajeros().add(pasajero.getNumeroDocumento());
        return reservaService.save(reserva);
    }

    public Reserva createReserva(Reserva reserva) {
        if(!hayPasajeros(reserva)){
            List<String> documentosPasajeros = new ArrayList<>();
            reserva.setDocumentosPasajeros(documentosPasajeros);
        }
        return reservaService.save(reserva);
    }

    private boolean hayPasajeros(Reserva reserva) {
        return Objects.nonNull(reserva.getDocumentosPasajeros());
    }
}
