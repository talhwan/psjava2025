package week15_book;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Jrent {
    String userId; // 사용자의 학번을 적을 예정!
    String bookId; // 책의 코드를 적을 예정!
    String startDate; // 대여 시작일
    String expectedDate; // 대여 예정일
    String endDate; // 대여 종료일

    public Jrent() {}
    public Jrent(String userId, String bookId, String startDate, String expectedDate) {
        this.userId = userId;
        this.bookId = bookId;
        this.startDate = startDate;
        this.expectedDate = expectedDate;
        this.endDate = null;
    }

    public String getNow(){
        return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }

    // 늦게 반납했는지 확인하기
    public boolean isOnTime(){
        String tempDate = getNow();
        if(getEndDate() != null){
            tempDate = getEndDate();
        }

        String expectedDate = getExpectedDate();
        String[] tempArr = {tempDate, expectedDate};
        Arrays.sort(tempArr);

        return (tempArr[0].equals(tempDate));
    }

    // 반납여부 확인하기
    public boolean isReturned(){
        //return !(this.endDate == null);
        return !(getEndDate() == null);
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getBookId() {
        return bookId;
    }
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }
    public String getStartDate() {
        return startDate;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    public String getExpectedDate() {
        return expectedDate;
    }
    public void setExpectedDate(String expectedDate) {
        this.expectedDate = expectedDate;
    }
    public String getEndDate() {
        return endDate;
    }
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
