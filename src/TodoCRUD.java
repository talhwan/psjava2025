import java.util.ArrayList;
import java.util.List;

public class TodoCRUD {
    List<Todo> todos;

    public TodoCRUD(){
        this.todos = new ArrayList<Todo>();
    }
    public void add(Todo todo){
        todos.add(todo);
    }
    public void update(int index, Todo todo){
        todos.set(index, todo);
    }
    public void delete(int index){
        todos.remove(index);
    }

    public void toPrint(){
        //foreach 구문!!
        for(Todo each : todos){
            System.out.println(each.getTitle() + " " + each.getContent() + " " + each.getDue() + " " + each.getCategory());
        }
    }

}