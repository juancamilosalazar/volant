package com.example.volant.volant.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransbordoEntity {
    private String idTransbordo;
    private UbicacionEntity ciudadTransbordo;
    private String codigoVuelo;
}
