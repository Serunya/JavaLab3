package task_four;

import task_one.View;

public class Main {
    public static void main(String[] args) {
        Car first_car = new Car("15", View.PASSENGER,4,"Blue"
                , new Engine("152","200 децибел",15,22));
        first_car.check_info();
    }
}
