package com.kodewala.constuctors1;

public class RapidoRide {

	int rideId;
	String customerName;
	String riderName;
	String pickupLocation;
	String dropLocation;
	double fare;

	RapidoRide(int rideId, String customerName, String riderName, String pickupLocation, 
			                String dropLocation, double fare) 
	{
 
		this.rideId = rideId;
		this.customerName = customerName;
		this.riderName = riderName;
		this.pickupLocation = pickupLocation;
		this.dropLocation = dropLocation;
		this.fare = fare;
	}

	void displayRide() {
		System.out.println("Ride ID: " + rideId);
		System.out.println("Customer: " + customerName);
		System.out.println("Rider: " + riderName);
		System.out.println("Pickup: " + pickupLocation);
		System.out.println("Drop: " + dropLocation);
		System.out.println("Fare: " + fare);
	}
}