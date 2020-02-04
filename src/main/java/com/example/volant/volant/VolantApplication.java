package com.example.volant.volant;

import com.example.volant.volant.entity.ReservaEntity;
import com.example.volant.volant.entity.TransbordoEntity;
import com.example.volant.volant.entity.TrayectoEntity;
import com.example.volant.volant.entity.UbicacionEntity;
import com.example.volant.volant.repository.ReservaRepository;
import org.bson.types.ObjectId;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class VolantApplication implements CommandLineRunner {
	@Autowired
	ReservaRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(VolantApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		List<String> documentos = new ArrayList<>();
		documentos.add("5467666");
		documentos.add("4352342");
		documentos.add("3245234");
		List<TrayectoEntity> trayectoEntities= new ArrayList<>();
		List<TransbordoEntity> transbordoEntities= new ArrayList<>();
		transbordoEntities.add(new TransbordoEntity("1234",new UbicacionEntity("Cundinamarca","Bogota"),"1231"));
		trayectoEntities.add(new TrayectoEntity(new UbicacionEntity("Antioquia","Medellin"),new UbicacionEntity("Caribe","Cartagena"),transbordoEntities));
		ReservaEntity reservaEntity = new ReservaEntity("1","1234",documentos,trayectoEntities,new Date());
		repository.save(reservaEntity);
	}
	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}
}
