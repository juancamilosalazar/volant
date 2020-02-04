package com.example.volant.volant.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Trayecto {
    private Ubicacion origen;
    private Ubicacion destino;
    private List<Transbordo> transbordos;

}
