package com.example.volant.volant.entity;

import com.example.volant.volant.model.Trayecto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(value = "reserva")
public class ReservaEntity {
    @Id
    private String id;
    private String codigoReserva;
    private List<String> documentosPasajeros;
    private List<TrayectoEntity> trayectos;
    private Date fecha;
}
