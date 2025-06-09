package week3to11;

public class Todo {
    String title; // 제목
    String content; // 내용
    String due; // 마감일
    String category; // 카테고리

    public Todo() {
    }
    public Todo(String title) {
        this.title = title;
    }
    public Todo(String title, String content, String due, String category) {
        this.title = title;
        this.content = content;
        this.due = due;
        this.category = category;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public String getContent() {
        return content;
    }

    public void setDue(String due) {
        this.due = due;
    }
    public String getDue() {
        return due;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public String getCategory() {
        return category;
    }

    @Override
    public String toString(){
        return title + "\t" + content + "\t" + due + "\t" + category;
    }

}