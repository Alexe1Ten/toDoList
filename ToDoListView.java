import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListView {
    private Scanner scanner;

    public ToDoListView() {
        scanner = new Scanner(System.in);
    }

    public int choise(String choise) {
        System.out.println(choise);
        return scanner.nextInt();
    }

    public void showToDoList(ArrayList<String> toDoList) {
        for (String task : toDoList) {
            System.out.println(task);
        }
    }
    

}
