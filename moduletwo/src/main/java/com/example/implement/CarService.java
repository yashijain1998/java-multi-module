package com.example.implement;
import com.example.spi.*;

public class  CarService implements VehicleProvider {

	public void wheels() {
		System.out.println("CarService has 4 wheels");
	}

}
