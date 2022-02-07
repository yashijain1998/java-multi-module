module impl {
    requires serviceProvider;
    provides com.example.spi.VehicleProvider with com.example.implement.BikeService, com.example.implement.CarService, com.example.implement.TruckService;
    // provides com.example.spi.VehicleProvider with com.example.implement.CarService;
    // provides com.example.spi.VehicleProvider with com.example.implement.TruckService;
}
