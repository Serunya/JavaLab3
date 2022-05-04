package task_five;
import task_one.Car;
import task_one.View;

public class Bus extends Car {
    public Bus(String stamp, int numberOfWheels, String color, String power) {
        super(stamp, View.BUS, numberOfWheels, color, power);
    }

    public Bus(String stamp, int numberOfWheels, String color, String power, String plate) {
        super(stamp, View.BUS, numberOfWheels, color, power, plate);
    }
}
