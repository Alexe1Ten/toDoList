public class Main {
    public static void main(String[] args) {
        ToDoListView view = new ToDoListView();
        ToDoListModel model = new ToDoListModel();
        ToDoListPresenter presenter = new ToDoListPresenter(view, model);
        presenter.menu();
    }
    
}
