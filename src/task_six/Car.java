package task_six;

import task_one.View;
import java.util.regex.Pattern;

public class Car {
    protected String plate = "Не задан";
    private final String stamp;
    private final View view;
    public String color;
    private String power;
    private final int numberOfWheels;
    private Pattern platePattern = Pattern.compile("^[АВЕКМНОРСТУХ]\\d{3}[АВЕКМНОРСТУХ]{2}\\d{2,3}(RUS)$");

    protected Car(String stamp, View view, int numberOfWheels, String color, String power){
        this.stamp = stamp;
        this.view = view;
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.power = power;
    };

    protected Car(String stamp, View view, int numberOfWheels, String color, String power, String plate){
        this.stamp = stamp;
        this.view = view;
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.power =  power;
        set_plate(plate);
    };
    public void set_plate(String plate){
        if(platePattern.matcher(plate).matches()){
            this.plate = plate;
        }
    }

    public void check_info(){
        System.out.println("Марка: " + stamp
                + "\nВид: " + view +
                "\nКол-во колёс: " + numberOfWheels +
                "\nЦвет: " + color +
                "\nМощность: " + power +
                "\nНомер: " + plate);
    }

}


