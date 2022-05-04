package task_five;

import task_one.Car;
import task_one.View;

public class Cargo extends Car {

    public Cargo(String stamp,String view, int numberOfWheels, String color, String power) {
        super(stamp, View.BUS, numberOfWheels, color, power);
    }

    public Cargo(String stamp, int numberOfWheels, String color, String power, String plate) {
        super(stamp, View.BUS, numberOfWheels, color, power, plate);
    }
}
