package com.daniel.apiRest;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {

	@GetMapping(value = "/listCars")
	public List<Cars> getAllCars() {
		String url = "http://api-test.bhut.com.br:3000/api/cars";
		RestTemplate rt = new RestTemplate();
		Cars[] cars = rt.getForObject(url, Cars[].class);
		Arrays.stream(cars).forEach(car -> System.out
				.println(car.get_id() + car.getTitle() + 
						car.getBrand() + car.getPrice() + car.getAge()));

		return Arrays.asList(cars);
	}
	@PostMapping(value = "/createCars")
	public List<Cars> setAllCars(@RequestBody Cars car){
		String url = "http://api-test.bhut.com.br:3000/api/cars";
		RestTemplate rt = new RestTemplate();
		Cars cars = rt.postForObject(url, car, Cars.class);
		System.out.println(car.get_id());
		
		return Arrays.asList(cars);
	}
	
}
