package api;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorEx {
    public static void main(String[] args) {
        // Iterator, java.util
        // 인터페이스
        // 인덱스 없는 set도 작업할 수 있는 통일된 방법

        List<String> list = new ArrayList<>();

        list.add("사과");
        list.add("배");
        list.add("수박");
        list.add("사과");
        list.add("복숭아");
        list.add("포도");

        // list 요소에 접근
        // 방법1
        for (int i = 0; i < list.size(); i++) {
            String data = list.get(i);
            // 출력 or 그 외의 작업
        }

        // 방법2 : 향상된 for문
        for (String data : list) {
            // data 관련된 작업
        }

        // 방법3 : Iterator
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            String data = iter.next();
        }

        Set<String> set = new HashSet<>();
        set.add("사과");
        set.add("배");
        set.add("수박");
        set.add("사과");
        set.add("복숭아");
        set.add("포도");
        set.add("배");

        // set 요소 접근하기
        // 방법1 for i 안됨
        // 방법2
        for (String data : set) {

        }

        // 방법3
        iter = set.iterator();
        while (iter.hasNext()) {
            String data = iter.next();
        }

    }
}
