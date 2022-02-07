package com.example.loader;

import java.util.ServiceLoader;
import com.example.spi.*;

/**
 * Hello world!
 *
 */
public class ServiceLoaderclass
{
    public static void main( String[] args )
    {
        System.out.println( "In service loader class" );
        ServiceLoader<VehicleProvider> serviceLoader = ServiceLoader.load(VehicleProvider.class);
        System.out.println(serviceLoader.stream().count());
		for (VehicleProvider service : serviceLoader) {
			service.wheels();
		}
    }
}
