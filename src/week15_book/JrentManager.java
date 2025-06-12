package week15_book;

import java.util.List;

public interface JrentManager {
    List<Jrent> getList();
    void add(Jrent rent);
    void done(String bookId);
}
