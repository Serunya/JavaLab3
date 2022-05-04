package task_four;
import task_one.View;

public class Car extends task_one.Car {
    private Engine engine;

    protected Car(String stamp, View view, int numberOfWheels, String color, Engine engine) {
        super(stamp, view, numberOfWheels, color, engine.get_power());
        this.engine = engine;
    }
    protected Car(String stamp, View view, int numberOfWheels, String color, Engine engine, String plate) {
        super(stamp, view, numberOfWheels, color, engine.get_power(),plate);
        this.engine = engine;
    }

    public void check_info(){
        System.out.println("Марка: " + stamp
                + "\nВид: " + view +
                "\nКол-во колёс: " + numberOfWheels +
                "\nЦвет: " + color +
                "\nНомер: " + plate +
                "\nДвигатель: " +
                "\n\tМощность: " + engine.power +
                "\n\tСерийный номер: " + engine.serial_number +
                "\n\tРасход: " + engine.expenditure +
                "\n\tРабочий объем: " + engine.displacement);
    }
}
