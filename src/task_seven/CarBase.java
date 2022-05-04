package task_seven;

import task_one.Car;

public final class CarBase {
    private Car[] cars;
    private Status[] places;
    private final int count_place;

    public CarBase(int count_place){
        cars = new Car[count_place];
        places = new Status[count_place];
        for(int i = 0; i < count_place; i++) {
            places[i] = Status.FREE;
        }
        this.count_place = count_place;
    }

    public int add_car(Car car){
        for(int i = 0; i < count_place; i++){
            if(places[i] == Status.FREE){
                cars[i] = car;
                places[i] = Status.BASE;
                return i;
            }
        }
        return -1;
    }

    public boolean add_car(Car car,int number_places){
        if(places[number_places] == Status.FREE){
            places[number_places] = Status.BASE;
            cars[number_places] = car;
            return true;
        }
        return false;
    }

    public boolean delete_car(Car car){
        for(int i = 0;i < count_place; i++){
            if(cars[i] == car){
                places[i] = Status.FREE;
                cars[i] = null;
                return true;
            }
        }
        return false;
    }
    public boolean on_flight(Car car){
        for(int i = 0; i < count_place; i++){
            if(cars[i] == car & places[i] == Status.BASE){
                places[i] = Status.FLIGHT;
                return true;
            }
        }
        return false;
    }

    public boolean on_repair(Car car){
        for(int i = 0;i < count_place;i++){
            if(cars[i] == car & places[i] == Status.BASE){
                places[i] = Status.REPAIR;
                return true;
            }
        }
        return false;
    }

    public boolean un_flight(Car car){
        for(int i = 0;i < count_place;i++){
            if(cars[i] == car & places[i] == Status.FLIGHT){
                places[i] = Status.BASE;
                return true;
            }
        }
        return false;
    }

    public boolean un_repair(Car car){
        for(int i = 0;i < count_place;i++){
            if(cars[i] == car & places[i] == Status.REPAIR){
                places[i] = Status.BASE;
                return true;
            }
        }
        return false;
    }

    public void is_base(){
        for(int i = 0; i < count_place; i++){
            if(places[i] == Status.BASE){
                System.out.println(cars[i]);
            }
        }
    }

    public void is_flight(){
        for(int i = 0; i < count_place; i++){
            if(places[i] == Status.FLIGHT){
                System.out.println(cars[i]);
            }
        }
    }

    public void is_repair(){
        for(int i = 0; i < count_place; i++){
            if(places[i] == Status.REPAIR){
                System.out.println(cars[i]);
            }
        }
    }
}
