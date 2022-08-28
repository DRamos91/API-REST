package com.daniel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daniel.Repository.CarRepository;
import com.daniel.model.Car;

@Service
public class CarService {
	
	@Autowired
	private CarRepository carsRepository;

	public List<Car> obterCarros() {
		return this.carsRepository.findAll();
	}

	public Car obterPorId(String _id) {
		return this.carsRepository.findById(_id)
				.orElseThrow(() -> new IllegalArgumentException("Carro não existe!"));
	}

	public Car criar(Car cars) {
		return this.carsRepository.save(cars);
	}

}
