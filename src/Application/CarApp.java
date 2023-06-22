package Application;

import annotation.Fanncy;
import data.Avanza;
import data.Car;
@Fanncy(name = "CarApp", tags = {"application","java"})
public class CarApp
{
    public static void main(String[] args)
    {
        Car car = new Avanza();
        System.out.println(car.getTier());
        car.drive();
    }
}
