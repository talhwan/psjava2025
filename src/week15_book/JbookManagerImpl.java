package week15_book;

import java.util.ArrayList;
import java.util.List;

public class JbookManagerImpl implements JbookManager {

    List<Jbook> books = null;

    public JbookManagerImpl() {
        this.books = new ArrayList<>();
        FileIO fileIO = new FileIO();
        String tempBooks = fileIO.in("books");
        System.out.println("tempBooks : " + tempBooks);


        if(tempBooks == null || tempBooks.isEmpty()){
            System.out.println("empty books");
        } else {
            //이제 데이터 불러올꺼임!
            System.out.println(tempBooks);
            String[] booksArray = tempBooks.split("\n");
            for(String each : booksArray){
                String[] eachArray = each.split("\t");
                Jbook book = new Jbook(eachArray[0], eachArray[1], eachArray[2]);
                this.books.add(book);
            }
        }
    }
    public List<Jbook> getList() {
        return books;
    }
    public void add(Jbook book) {
        String tempCode = book.getCode();
        boolean found = false;
        for(Jbook each : books){
            if(each.getCode().equals(tempCode)){
                found = true;
            }
        }
        if(!found){
            books.add(book);
            save();
        }
    }

    public void save(){
        FileIO fileIO = new FileIO();
        StringBuilder booksString = new StringBuilder();
        for(Jbook each : books){
            booksString.append(each.toString()).append("\n");
        }
        fileIO.out("books", booksString.toString());
    }
}
