import java.util.ArrayList;

public class ToDoListModel {
    
    private ArrayList<String> toDoList;

    public ToDoListModel() {
        toDoList = new ArrayList<>();
    }

    public void addTask(String task) {
        this.toDoList.add(task);
    }

    public ArrayList<String> getList() {
        return toDoList;
    }
    
}
