package task_five;
import task_one.Car;
import task_one.View;

import java.util.regex.Pattern;

public class Special extends Car {
    protected final String view;
    public Special(String stamp, String view, int numberOfWheels, String color, String power) {
        super(stamp, View.SPECIAL, numberOfWheels, color, power);
        this.view = view;
    }

    public Special(String stamp,String view, int numberOfWheels, String color, String power, String plate) {
        super(stamp, View.SPECIAL, numberOfWheels, color, power);
        this.view = view;
        set_plate(plate);
    }

    public void set_plate(String plate)
    {
        Pattern pattern = Pattern.compile("/^(\\s*)?(\\+)?([- _():=+]?\\d[- _():=+]?){10,14}(\\s*)?$/");
        if (pattern.matcher(plate).matches()){
            super.plate = plate;
        }
    }
}
