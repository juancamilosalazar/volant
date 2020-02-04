package com.example.volant.volant.entity;

import com.example.volant.volant.model.Transbordo;
import com.example.volant.volant.model.Ubicacion;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TrayectoEntity {
    private UbicacionEntity origen;
    private UbicacionEntity destino;
    private List<TransbordoEntity> transbordos;
}
