package task_eight;

import java.util.ArrayList;
import java.util.Scanner;

public class InputFunc {
    InputFunc(){
        System.out.println("Создал окно ввода");
        ArrayList<dot> dots = input();
        if(dots.size() < 2){
            System.out.println("ОШИБКА, нельзя сделать функцию меньше чем из 2 точек");
        }
        else{
            new Function(dots);
        }
    }
    ArrayList<dot> input(){
        ArrayList<dot> dots = new ArrayList<dot>();
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int x;
        int y;
        System.out.println("Введите точки, для конца ввода введите 0 0");
        while (true){
            System.out.print("Введите x" + count+ ":");
            x = scanner.nextInt();
            System.out.print("Введите y" + count+ ":");
            y = scanner.nextInt();
            if (x == 0 && y == 0){
                break;
            }
            dot d = new dot(x,y);
            dots.add(d);
            count++;
        }
        System.out.println("Введено точек " + dots.size());
        return dots;
    }
}
