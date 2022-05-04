package task_eight;

public class MainFrame {
    MainFrame(){
        new BorderLine();
    }

    public static void main(String[] args) {
        Function.colors.add("Синий");
        Function.colors.add("Красный");
        Function.colors.add("Зеленый");
        new MainFrame();
        new InputFunc();
    }
}

