package com.Emirates_app.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Emirates_app.Repository.PassengerRepository;
import com.Emirates_app.entity.Passenger;

@RestController

@RequestMapping("/api")
public class PassengerRestController {
@Autowired
	
	private PassengerRepository pasrepo;

	//http://localhost:8080/api/listallapi
	
	@GetMapping("/listallapi")
	
	public List<Passenger>getall(Passenger pas){
		
		List<Passenger> listapi = pasrepo.findAll();
		
		return listapi;
	}
	
	//http://localhost:8080/api/saveapi
	
	@PostMapping("/saveapi")
	public void saveapi(@RequestBody Passenger pas) {
		pasrepo.save(pas);
		
		
	}
	
	//http://localhost:8080/api/updateapi
	
	@PutMapping("/updateapi")
	public void updateapi(@RequestBody Passenger pas) {
		pasrepo.save(pas);
		
	


	}
}
