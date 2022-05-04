package task_eight;

import java.util.ArrayList;

public class Function {
    public static int count_func = -1;
    static ArrayList<String> colors = new ArrayList<String>();
    Function(ArrayList<dot> dots){
        count_func++;
        if(colors.size() >= count_func) {
            System.out.println("Установил цвет рисования " + colors.get(count_func));
            dot d = dots.get(0);
            add_dot(d);
            for(int i = 1; i < dots.size();i++){
                add_dot(dots.get(i));
                connect_dot(dots.get(i-1),dots.get(i));
            }
        }
        else{
            System.out.println("Закончились цвета, Ошибка");
        }
    }
    Function(ArrayList<dot> dots,String color){
        System.out.println("установил цвет рисования " + color);
        dot d = dots.get(0);
        add_dot(d);
        for(int i = 1; i < dots.size();i++){
            add_dot(dots.get(i));
            connect_dot(dots.get(i-1),dots.get(i));
        }
    }

    public void connect_dot(dot d1, dot d2){
        System.out.println("Соеденил (" + d1.x + " " + d1.y + ") и (" + d2.x + " " + d2.y + ")");
    }

    public void add_dot(dot d){
        int x = d.x;
        int y = d.y;
        System.out.println("Добавил точку x: " + Integer.toString(x) +" "+ "y: " + Integer.toString(y));
    }
}
