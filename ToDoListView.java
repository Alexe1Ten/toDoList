import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListView {
    private Scanner scanner;

    public ToDoListView() {
        scanner = new Scanner(System.in);
    }

    public int choise() {
        System.out.println("Выберете пункт меню: ");
        return scanner.nextInt();
    }

    public String takeTask() {
        System.out.println("Напишите задачу: ");
        return scanner.next().toString();
    }

    public void showToDoList(ArrayList<String> toDoList) {
        for (String task : toDoList) {
            System.out.println(task);
        }
    }

    public void continueFurther() {
        System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
            clearConsole();
        }
        catch(Exception e)
        {}
    }

    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    

}
