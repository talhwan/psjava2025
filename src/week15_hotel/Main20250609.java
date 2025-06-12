package week15_hotel;

public class Main20250609 {
    public static void main(String[] args) {
        Main20250609 ps = new Main20250609();
        ps.pj();
    }

    public void pj() {
        /*
        * 호텔 예약을 하기 위해서는..
        * 사용자 정보 등록 및 관리
        * 객실에 대한 정보 등록 및 관리
        * 예약 정보 등록 및 관리
        * 
        * 객실, 사용자, 예약
        * */

        HroomManager hroomManager = new HroomManagerImpl();
        Hroom hroom = new Hroom("102", "스위트", 100000);
        hroomManager.add(hroom);

        HuserManager huserManager = new HuserManagerImpl();
        Huser huser = new Huser("1", "이름1", "010", "1990-01-01");
        Huser huser2 = new Huser("2", "이름2", "012", "1990-01-01");
        huserManager.add(huser2);

        HreservationManager hreservationManager = new HreservationManagerImpl();
        /*
        int aaa =  hreservationManager.getTerm("1990-01-01", "1990-01-03");
        System.out.println(aaa);
        String bbb = hreservationManager.addDate("1990-01-01", 3);
        System.out.println(bbb);
        */
        Hreservation hreservation = new Hreservation("3", "2", "102", "2025-05-24", "2025-05-25", true);
        hreservationManager.add(hreservation);
    }
}
