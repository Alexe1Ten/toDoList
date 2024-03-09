public class ToDoListPresenter {
    private ToDoListView view;
    private ToDoListModel model;
    private boolean flag;

    public ToDoListPresenter(ToDoListView view, ToDoListModel model) {
        this.model = model;
        this.view = view;
    }

    public void menu(int choise) {
        while (flag) {
            switch (choise) {
                case 1: addTask(null);
                case 2: showToDoList();
                case 3: 


                default:
                    break;
            }
        }
    }
    
}
