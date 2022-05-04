package task_one;

import java.util.regex.Pattern;

public class Car {
    protected String plate = "Не задан";
    protected final String stamp;
    protected final View view;
    public String color;
    public String power;
    protected final int numberOfWheels;
    private Pattern platePattern = Pattern.compile("^[АВЕКМНОРСТУХ]\\d{3}[АВЕКМНОРСТУХ]{2}\\d{2,3}(RUS)$");

    public Car(String stamp, View view, int numberOfWheels, String color, String power){
        this.stamp = stamp;
        this.view = view;
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.power = power;
    };

    public Car(String stamp, View view, int numberOfWheels, String color, String power, String plate){
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


