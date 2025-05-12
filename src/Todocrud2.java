import java.util.*;

public class Todocrud2 implements Icrud2{
    //List<TodoItem> list = new ArrayList<TodoItem>();
    List<TodoItem> list = null;

    @Override
    public void create(TodoItem item) {
        if(list == null){
            list = new ArrayList<>();
        }
        list.add(item);
    }

    @Override
    public TodoItem read(int index) {
        return list.get(index);
    }

    @Override
    public void update(int index, TodoItem item) {
        list.set(index, item);
    }

    @Override
    public void delete(int index) {
        list.remove(index);
    }

    @Override
    public void print(String orderBy) {
        switch (orderBy) {
            case "title":
                list.sort(new ComparatorTitle().reversed());
                break;
            case "cdate":
                Collections.sort(list, new ComparatorCdate().reversed());
                break;
        }
        for(TodoItem item : list){
            System.out.println(item);
        }
    }
}
class ComparatorTitle implements Comparator<TodoItem> {
    @Override
    public int compare(TodoItem f1, TodoItem f2) {
        return f1.title.compareTo(f2.title);
    }
}
class ComparatorCdate implements Comparator<TodoItem> {
    @Override
    public int compare(TodoItem f1, TodoItem f2) {
        return f1.cdate.compareTo(f2.cdate);
    }
}
