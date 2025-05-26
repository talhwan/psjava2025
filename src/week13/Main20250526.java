package week13;

import week12.Student;

import java.text.SimpleDateFormat;
import java.util.*;

public class Main20250526 {
    public static void main(String[] args) {
        Main20250526 ps = new Main20250526();
        ps.testSet();
    }

    public void testSet() {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("A");
        set.add("C");
        set.add("C");
        System.out.println(set);
        set.remove("B");
        System.out.println(set);

        Date nowDate = new Date();

        SimpleDateFormat simpleDateFormat = null;

        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(nowDate));

        Date startDate = null;
        Date endDate = null;

        //int dif = (int) ((endDate.getTime()-startDate.getTime()) / (24*60*60*1000));

    }
    public void testMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("key1", "value1");
        System.out.println(map.get("key1")); // value1
        map.put("key1", "value2");
        System.out.println(map.get("key1")); // value2
        /*
        1) key 값 중복으로 에러
        2) 원래값 유지
        3) 새로운값 반영! (O)
        * */
        map.remove("key1");
        System.out.println(map.get("key1")); // ?
        System.out.println(map.get("key2")); // ?
        /*
        1) key 없음으로 에러
        2) 공백
        3) null
        * */

    }
    public void testList() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("1122");
        list.add("112333");

        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }

        list.remove(1);

        for(String each : list) {
            System.out.println(each);
        }

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(1);
        list2.add(1);
        for(int each : list2) {
            System.out.println(each);
        }
    }
}
