package task_tree;
import task_two.Complex;

public class Main {
    public static void main(String[] args) {
        Complex s = new Complex(5,2);
        System.out.println(Complex.sin(s).x());
    }
}
