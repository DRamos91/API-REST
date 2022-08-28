package com.daniel.Repository;

import java.util.Date;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.daniel.model.Car;

public interface CarRepository extends MongoRepository<Car, String>{


}
