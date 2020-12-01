package com.nazmul;

public class CarShop {

    //because we want to keep track on the number of cars that we   have sold
    int carSold;
    private static CarShop carShop;
    public CarFactory carFactory;


    //we start our bussiness from zero
    public CarShop() {
        carSold = 0;
        carFactory = new CarFactory();
    }

    //you make a static function that return the carShop
    public static CarShop getInstance() {
        if (carShop == null)
            carShop = new CarShop();
        return carShop;
    }

    //function to sell our car, as it returns car
    public Car sellCar(String carType) {
        carSold++;
        return carFactory.getCar(carType);
    }

    public SportCar sellSportCar() {
        carSold++;
        return new SportCar();
    }
}
