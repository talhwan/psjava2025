package week15_book;

public class Jbook {
    String code; // 책 일련번호 (id값 처럼 사용할 예정)
    String title; // 책 제목
    String author; // 책 저자

    public Jbook() {}
    public Jbook(String code, String title, String author) {
        this.code = code;
        this.title = title;
        this.author = author;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
}
