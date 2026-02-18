package study.builder.example.director;

import study.builder.example.builders.Builder;
import study.builder.example.cars.CarType;
import study.builder.example.components.Engine;
import study.builder.example.components.GPSNavigator;
import study.builder.example.components.Transmission;
import study.builder.example.components.TripComputer;

//Classe responsavel por definir a ordem das etapas de construcao.
public class Director {

	 public void constructSportsCar(Builder builder) {
	        builder.setCarType(CarType.SPORTS_CAR);
	        builder.setSeats(2);
	        builder.setEngine(new Engine(3.0, 0));
	        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
	        builder.setTripComputer(new TripComputer());
	        builder.setGPSNavigator(new GPSNavigator());
	    }

	    public void constructCityCar(Builder builder) {
	        builder.setCarType(CarType.CITY_CAR);
	        builder.setSeats(2);
	        builder.setEngine(new Engine(1.2, 0));
	        builder.setTransmission(Transmission.AUTOMATIC);
	        builder.setTripComputer(new TripComputer());
	        builder.setGPSNavigator(new GPSNavigator());
	    }

	    public void constructSUV(Builder builder) {
	        builder.setCarType(CarType.SUV);
	        builder.setSeats(4);
	        builder.setEngine(new Engine(2.5, 0));
	        builder.setTransmission(Transmission.MANUAL);
	        builder.setGPSNavigator(new GPSNavigator());
	    }
	
}
