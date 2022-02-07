package com.example.implement;

import com.example.spi.*;

public class  BikeService implements VehicleProvider {

	public void wheels() {
		System.out.println("Bike service has 2 wheels");
	}

}

