package Application;

import data.Avanza;
import data.Car;

public class CarApp
{
    public static void main(String[] args)
    {
        Car car = new Avanza();
        System.out.println(car.getTier());
        car.drive();
    }
}
