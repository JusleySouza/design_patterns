package study.builder.example;

import study.builder.example.builders.CarBuilder;
import study.builder.example.builders.CarManualBuilder;
import study.builder.example.cars.Car;
import study.builder.example.cars.Manual;
import study.builder.example.director.Director;

public class Demo {

	public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSUV(builder);

        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructSUV(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
	
}
