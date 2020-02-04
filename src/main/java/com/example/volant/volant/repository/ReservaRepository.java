package com.example.volant.volant.repository;

import com.example.volant.volant.entity.ReservaEntity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepository extends MongoRepository<ReservaEntity, ObjectId> {
    ReservaEntity findByCodigoReserva(String codigo);
}
