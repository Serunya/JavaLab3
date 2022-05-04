package task_five;

import task_one.Car;
import task_one.View;

public class Passanger extends Car {

    public Passanger(String stamp, int numberOfWheels, String color, String power) {
        super(stamp, View.PASSENGER, numberOfWheels, color, power);
    }

    public Passanger(String stamp, int numberOfWheels, String color, String power, String plate) {
        super(stamp, View.PASSENGER, numberOfWheels, color, power, plate);
    }
}
