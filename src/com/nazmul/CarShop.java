package com.nazmul;

public class CarShop {

    //because we want to keep track on the number of cars that we   have sold
    int carSold;
    private static CarShop carShop;

    //we start our bussiness from zero
    public CarShop() {
        carSold = 0;
    }

    //you make a static function that return the carShop
    public static CarShop getInstance() {
        if (carShop == null)
            carShop = new CarShop();
        return carShop;
    }

    //function to sell our car, as it returns car
    public Car sellCar() {
        carSold++;
        return new Car();
    }
}
