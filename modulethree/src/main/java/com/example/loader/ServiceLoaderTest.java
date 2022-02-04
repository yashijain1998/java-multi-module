package com.example.loader;

import java.util.ServiceLoader;
import com.example.spi.*;

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
        System.out.println(VehicleProvider.class);
        System.out.println(serviceLoader.stream().count());
		// for (VehicleProvider service : serviceLoader) {
		// 	service.tier();
		// }
    }
}
