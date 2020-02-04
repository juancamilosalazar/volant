package com.example.volant.volant.model;


import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;

import java.util.List;

@Getter
@Setter
public class Reserva {
    private String id;
    private String codigoReserva;
    private List<String> documentosPasajeros;
    private List<Trayecto> trayectos;
    private Long fecha;
}
