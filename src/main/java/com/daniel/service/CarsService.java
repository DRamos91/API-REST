package com.daniel.service;

import java.util.List;

import com.daniel.model.Cars;

public interface CarsService {
	
	public List <Cars> obterCarros();
	
	
	public Cars obterPorId (String _id);
	
	public Cars criar (Cars cars);

}
