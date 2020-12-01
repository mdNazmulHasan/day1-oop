package com.nazmul;

public class CarFactory {

    public Car getCar(String carType) {
        if (carType.equalsIgnoreCase("SportCar")) {
            return new SportCar();

        } else if (carType.equalsIgnoreCase("FlyingCar")) {
            return new FlyingCar();
        }

        return null;
    }
}
