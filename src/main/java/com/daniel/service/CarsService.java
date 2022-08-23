package com.daniel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daniel.Repository.CarsRepository;
import com.daniel.model.Cars;

@Service
public class CarsService {
	
	@Autowired
	private CarsRepository carsRepository;

	public List<Cars> obterCarros() {
		return this.carsRepository.findAll();
	}

	public Cars obterPorId(String _id) {
		return this.carsRepository.findById(_id)
				.orElseThrow(() -> new IllegalArgumentException("Carro não existe!"));
	}

	public Cars criar(Cars cars) {
		return this.carsRepository.save(cars);
	}

}
