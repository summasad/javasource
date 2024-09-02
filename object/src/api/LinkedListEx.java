package api;

import java.util.List;
import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        list.add("사과");
        list.add("배");
        list.add("수박");
        list.add("사과");
        list.add("복숭아");
        list.add("포도");

        System.out.println(list);
    }
}
