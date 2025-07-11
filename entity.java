package com.Emirates_app.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="passengers")
public class Passenger {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String Name;
	private String travelFrom;
	private String Destination;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getTravelFrom() {
		return travelFrom;
	}
	public void setTravelFrom(String travelFrom) {
		this.travelFrom = travelFrom;
	}
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String destination) {
		Destination = destination;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public long getContact() {
		return Contact;
	}
	public void setContact(long contact) {
		Contact = contact;
	}
	private Date date;
	private long Contact;

}
