package week15_book;

import java.util.List;

public class Main20250609003 {

    public static void main(String[] args) {
        Main20250609003 ps = new Main20250609003();
        ps.jmini();
    }

    public void jmini(){
        /*
        * 도서관리 시스템!!
        *
        * 1) 책 등록 / 관리
        * 2) 사용자 (책을 대여할 사람) 등록 / 관리
        * 3) 책 대여 
        * 
        * => 책 / 사용자 / 대여 각각 클래스 만들기!
        * */

        JrentManager jrentManager = new JrentManagerImpl();
        Jrent jrent = new Jrent("101", "111");
        jrentManager.add(jrent);

        jrentManager.done("111");

/*
        JbookManager jbookManager = new JbookManagerImpl();
        List<Jbook> books = jbookManager.getList();
        System.out.println(books);

        Jbook jbook = new Jbook("112", "title1","author1");
        jbookManager.add(jbook);
        System.out.println(books);


        JuserManager juserManager = new JuserManagerImpl();
        List<Juser> users = juserManager.getList();
        System.out.println(users);

        Juser juser = new Juser("102", "name", "011", "2000-01-01", "M");
        juserManager.add(juser);
        System.out.println(users);
        */


    }

}
