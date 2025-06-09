package week15_book;

import java.util.ArrayList;
import java.util.List;

public class Jmanager {

    List<Jbook> books = null;
    List<Juser> users = new ArrayList<>();
    List<Jrent> rents = new ArrayList<>();

    public Jmanager() {
        //?????
        FileIO fileIO = new FileIO();
        String tempBooks = fileIO.in("books");
        if(tempBooks == null || tempBooks.isEmpty()){
            this.books = new ArrayList<>();
        } else {
            //이제 데이터 불러올꺼임!
            //목요일날 이어서 ㄱㄱ
        }
    }
    public List<Jbook> getBooks() {
        return books;
    }
    public void addBook(Jbook book) {
        String tempCode = book.getCode();
        boolean found = false;
        for(Jbook each : books){
            if(each.getCode().equals(tempCode)){
                found = true;
            }
        }
        if(!found){
            books.add(book);
        }

    }
}
