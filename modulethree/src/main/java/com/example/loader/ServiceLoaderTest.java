package com.example.loader;

import java.util.ServiceLoader;
import VehicleProvider;

/**
 * Hello world!
 *
 */
public class ServiceLoaderTest 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ServiceLoader<VehicleProvider> serviceLoader = ServiceLoader.load(VehicleProvider.class);

		for (VehicleProvider service : serviceLoader) {
			service.tier();
		}
    }
}
