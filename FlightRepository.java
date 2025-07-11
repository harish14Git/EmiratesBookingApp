package com.Emirates_app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Emirates_app.entity.Passenger;
import com.Emirates_app.services.PassengerService;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

	

}
