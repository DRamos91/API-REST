package com.daniel.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.daniel.model.Cars;

public interface CarsRepository extends MongoRepository<Cars, String>{

}
