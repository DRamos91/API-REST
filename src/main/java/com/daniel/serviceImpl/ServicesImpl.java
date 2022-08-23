package com.daniel.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daniel.Repository.CarsRepository;
import com.daniel.model.Cars;
import com.daniel.service.CarsService;

@Service
public class ServicesImpl implements CarsService{
	
	@Autowired
	private CarsRepository carsRepository;

	@Override
	public List<Cars> obterCarros() {
		return this.carsRepository.findAll();
	}

	@Override
	public Cars obterPorId(String _id) {
		return this.carsRepository.findById(_id)
				.orElseThrow(() -> new IllegalArgumentException("Carro não existe!"));
	}

	@Override
	public Cars criar(Cars cars) {
		return this.carsRepository.save(cars);
	}

	
	
}
