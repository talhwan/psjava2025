package week3to11;

public interface Icrud {
    public void create(Todo todo);
    public Todo read(int id);
    public void update(int id, Todo todo);
    public void delete(int id);
}
