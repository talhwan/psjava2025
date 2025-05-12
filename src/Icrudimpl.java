import java.util.ArrayList;
import java.util.List;

public class Icrudimpl implements Icrud{
    List<Todo> todos = new ArrayList<Todo>();

    @Override
    public void create(Todo todo) {
        todos.add(todo);
    }

    @Override
    public Todo read(int id) {
        return todos.get(id);
    }

    @Override
    public void update(int id, Todo todo) {
        todos.set(id, todo);
    }

    @Override
    public void delete(int id) {
        todos.remove(id);
    }
}
