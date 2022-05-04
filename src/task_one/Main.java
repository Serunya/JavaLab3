package task_one;

public class Main {
    public static void main(String[] args) {
        Car first_car = new Car("Kia",View.CARGO,400,"Blue","200","А");
        first_car.check_info();
        first_car.set_plate("А232АВ12RUS");
        first_car.color = "Синий";
        first_car.power = "200 децибелл";
        first_car.check_info();
    }
}
