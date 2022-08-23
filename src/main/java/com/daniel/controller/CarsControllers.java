package com.daniel.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.daniel.model.Cars;
import com.daniel.service.CarsService;

@RestController
@RequestMapping("/Cars")
public class CarsControllers {
	
	@Autowired
	private CarsService carsService;
	
	@GetMapping(value = "/listCars")
	public List<Cars> getAllCars(){
//	public void obterCarros() {
			String url = "http://api-test.bhut.com.br:3000/api/cars";
			RestTemplate rt = new RestTemplate();
			Cars[] cars = rt.getForObject(url, Cars[].class);
			Arrays.stream(cars).forEach(car -> System.out
					.println(car.get_id() + car.getTitle() + 
							car.getBrand() + car.getPrice() + car.getAge()));

			return Arrays.asList(cars);
			
	}
	
	@GetMapping("/{_id}")
	public Cars obterPorId(@PathVariable String _id) {
		return this.carsService.obterPorId(_id);
	}

	@PostMapping(value = "/createCars")
	public List<Cars> setAllCars(@RequestBody Cars car){
//	public void criar(@RequestBody Cars car) {
			String url = "http://api-test.bhut.com.br:3000/api/cars";
			RestTemplate rt = new RestTemplate();
			Cars cars = rt.postForObject(url, car, Cars.class);

		//	System.out.println(car.get_id());
			return Arrays.asList(cars);
		
	}
	
}
