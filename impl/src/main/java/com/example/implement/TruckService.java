package com.example.implement;
import com.example.spi.*;

public class  TruckService implements VehicleProvider {

	public void wheels() {
		System.out.println("Truck service has 12 wheels");
	}

}

