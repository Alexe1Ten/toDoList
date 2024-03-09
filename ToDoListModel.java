import java.util.ArrayList;

public class ToDoListModel {
    
    private ArrayList<String> toDoList;

    public ToDoListModel() {
        toDoList = new ArrayList<>();
    }

    public void showToDoList() {
        for (String task : toDoList) {
            System.out.println(task);
        }
    }

    public void addTask(String task) {
        toDoList.add(task);
    }

    public ArrayList<String> getList() {
        return toDoList;
    }
    
}
