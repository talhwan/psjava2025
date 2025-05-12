public class TodoItem {
    //제목 내용 등록일
    String title;
    String content;
    String cdate;

    public TodoItem() {
    }
    public TodoItem(String title, String content, String cdate) {
        this.title = title;
        this.content = content;
        this.cdate = cdate;
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

    public void setCdate(String cdate) {
        this.cdate = cdate;
    }
    public String getCdate() {
        return cdate;
    }

    @Override
    public String toString() {
        return title + "/" + content + "/" + cdate;
    }
}
