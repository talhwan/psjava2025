package week12;

import java.util.*;

public class Main20250522 {
    public static void main(String[] args) {
        Main20250522 ps = new Main20250522();
        ps.testSet();
    }

    public void testSet() {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("A");
        for(String s : set) {
            System.out.println(s);
        }

        Set<Student> setStudent = new HashSet<>();
        Student student = new Student();
        setStudent.add(student);
    }
    public void testMap() {
        Map<String, Object> map = new HashMap<>();
        Map<Integer, String> map1 = new HashMap<>();

        map.put("key1", "value1");
        map1.put(111, "value01");

        System.out.println(map.get("key1"));

        map.put("key1", "value02");
        /*
        1) 에러..
        2) value1
        3) value02 정답!! 새로운 값으로 덮어쓰기 ㄱㄱㄱ!!
        * */
        System.out.println(map.get("key1"));

        map.remove("key1");

        System.out.println(map.get("key2"));
        /*
        1) 에러..
        2) 공백 ""
        3) null
        * */


        Map<String, Student> mapStudent = new HashMap<>();
        Student student = new Student();
        mapStudent.put("1", student);
    }
    public void testList() {
        List<String> list = new ArrayList<String>();
        list.add("1111");
        list.add("1112");
        list.add("1113");

        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }

        list.remove(1);
        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }

        List<Integer> aaa = new ArrayList<>();
        int a1 = 0;
        aaa.add(a1);

        for(int a : aaa){
            System.out.println(a);
        }

        List<Student> listStudent = new ArrayList<>();
        Student student = new Student();
        listStudent.add(student);

    }
}
