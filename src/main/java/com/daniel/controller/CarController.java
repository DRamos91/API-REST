package com.daniel.controller;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.daniel.Repository.CarRepository;
import com.daniel.model.Car;
import com.daniel.service.CarService;

@RestController
@RequestMapping("/api")
public class CarController {

	@Autowired
	private CarService carsService;
	
	@Autowired
	private CarRepository carsRepository;

	@GetMapping(value = "/listCars")
	public List<Car> getAllCars() {

		String url = "http://api-test.bhut.com.br:3000/api/cars";
		RestTemplate rt = new RestTemplate();
		Car[] cars = rt.getForObject(url, Car[].class);
		

		return Arrays.asList(cars);

	}

	@GetMapping("/{_id}")
	public Car obterPorId(@PathVariable String _id) {
		return this.carsService.obterPorId(_id);
	}
	
	@GetMapping(value = "/logs")
	public List<Car> obterCarros(@RequestBody String _id) {
		List<Car> list = carsService.obterCarros();
		
		return this.carsService.obterCarros();
		

	}
	
	@PostMapping(value = "/createCar")
	public List<Car> setAllCars(@RequestBody Car car) {
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//		sdf.setTimeZone(TimeZone.getTimeZone("GMT-3"));
		
//		Date d = Date.from(Instant.now());
		
		String url = "http://api-test.bhut.com.br:3000/api/cars";
		RestTemplate rt = new RestTemplate();
		Car cars = rt.postForObject(url, car, Car.class);
			
		carsRepository.saveAll(Arrays.asList(cars));
		
		return Arrays.asList(cars);

	}

}
