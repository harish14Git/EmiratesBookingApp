package com.Emirates_app.services;

import java.util.List;

import com.Emirates_app.entity.Passenger;

public interface PassengerService {
	public void savepassengerdata(Passenger pass);
	
	public List<Passenger> getallInfo(Passenger pass);


}
