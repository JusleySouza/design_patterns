package study.builder.example.builders;

import study.builder.example.cars.CarType;
import study.builder.example.components.Engine;
import study.builder.example.components.GPSNavigator;
import study.builder.example.components.Transmission;
import study.builder.example.components.TripComputer;

//A interface do construtor define todas as maneiras possiveis de configurar um produto.
public interface Builder {
	 void setCarType(CarType type);
	    void setSeats(int seats);
	    void setEngine(Engine engine);
	    void setTransmission(Transmission transmission);
	    void setTripComputer(TripComputer tripComputer);
	    void setGPSNavigator(GPSNavigator gpsNavigator);
}
