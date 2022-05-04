package task_four;

public class Engine {
    protected String serial_number;
    protected String power;
    protected double displacement;
    protected int expenditure;
    private Engine(){};

    public String get_power(){return this.power;}

    public Engine(String serial_number,String power, double displacement,int expenditure){
        this.displacement = displacement;
        this.expenditure = expenditure;
        this.power = power;
        this.serial_number = serial_number;
    }
}
