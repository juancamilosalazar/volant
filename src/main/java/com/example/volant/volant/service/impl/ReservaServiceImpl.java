package com.example.volant.volant.service.impl;
import com.example.volant.volant.entity.ReservaEntity;
import com.example.volant.volant.model.Reserva;
import com.example.volant.volant.repository.ReservaRepository;
import com.example.volant.volant.service.ReservaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReservaServiceImpl implements ReservaService {
    @Autowired
    ReservaRepository repository;
    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<Reserva> findAll() {
        return repository.findAll()
                .parallelStream()
                .map(entity -> modelMapper.map(entity, Reserva.class))
                .collect(Collectors.toList());
    }

    @Override
    public Reserva findByCodigo(String codigo) {
        return modelMapper.map(repository.findByCodigoReserva(codigo),Reserva.class);
    }

    @Override
    public Reserva save(Reserva reserva) {
        return modelMapper.map(repository.save(modelMapper.map(reserva, ReservaEntity.class)),Reserva.class);
    }

    @Override
    public void delete(Reserva reserva) {
    //vcb
    }
}
