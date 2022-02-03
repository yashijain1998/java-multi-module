module moduletwo {
    requires com.example.spi.VehicleProvider;
    provides com.example.spi.VehicleProvider with com.example.implement.BikeService;
    provides com.example.spi.VehicleProvider with com.example.implement.CarService;
    provides com.example.spi.VehicleProvider with com.example.implement.TruckService;
}
