package week3to11;

public interface Icrud2 {
    public void create(TodoItem item);
    public TodoItem read(int index);
    public void update(int index, TodoItem item);
    public void delete(int index);
    public void print(String orderBy);
}
