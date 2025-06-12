package week15_hotel;

import java.text.ParseException;

public interface HreservationManager {
    void init();
    void add(Hreservation hreservation);
    void fileOut();

    String getNow(int addDate);
    int getTerm(String sDate, String fDate);
    String addDate(String nowDate, int addDate);
}
