package week15_book;

public class Main20250609003 {

    public static void main(String[] args) {
        Main20250609003 ps = new Main20250609003();
        ps.jmini();
    }

    public void jmini(){
        FileIO fileIO = new FileIO();
        fileIO.out("books", "");

        String aaaa = fileIO.in("books");
        System.out.println(aaaa);
        /*
        * 도서관리 시스템!!
        *
        * 1) 책 등록 / 관리
        * 2) 사용자 (책을 대여할 사람) 등록 / 관리
        * 3) 책 대여 
        * 
        * => 책 / 사용자 / 대여 각각 클래스 만들기!
        * */

        //책 등록
        Jbook jbook = new Jbook("111", "title1","author1");
        //books.add(jbook);


    }

}
