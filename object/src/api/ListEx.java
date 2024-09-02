package api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {

        // ArrayList : 데이터 베이스 구축에 중요

        // <객체> : 리스트에 담을 타입
        // int 담고 싶으면 => 객체화해야함
        // <Integer> : int의 객체화
        // <Double>
        List<String> list = new ArrayList<>(); // new List 못하기 때문에 ArrayList, 다형성
        // 리스트 안에 10개의 String 을 담는 기본 크기
        // 크기 설정할 수도 있음

        // add() : 순서대로 추가
        list.add("사과");
        list.add("배");
        list.add("수박");
        list.add("사과");
        list.add("복숭아");
        list.add("포도");

        // add(index, 요소) : index에 추가
        list.add(2, "바나나");
        // 위치 지정해서 끼워넣음, 기존 값들 뒤로 밀림
        // 리스트 위치값 변경됨 - 리스트 활용도 떨어짐
        // 많이 추가할 떄는 LinkedList => 순서대로 추가

        // 확인
        System.out.println(list);

        System.out.println("크기 : " + list.size());

        System.out.println("특정 위치 요소 가져오기 " + list.get(3));
        System.out.println("특정 위치 요소 제거 " + list.remove(3));
        // 리턴을 스트링으로
        System.out.println(list);
        System.out.println("특정 요소 제거 " + list.remove("복숭아"));
        System.out.println(list);

        System.out.println("특정 요소 포함 여부 " + list.contains("포도"));
        System.out.println("특정 요소 저장 위치 " + list.indexOf("포도"));
        Object[] arr = list.toArray(); // Object 배열로 돌아옴
        for (Object object : arr) {
            System.out.println(object);
        }
        list.sort(Comparator.reverseOrder()); // 내림차순
        System.out.println(list);

        // 정렬방법 1. list.sort(Comparator.reverseOrder());
        // 방법 2. 부모 메소드 소환 java.util.Collections : Collection과 관련된 유용한 메소드 제공해주는 클래스
        Collections.sort(list, Comparator.naturalOrder()); // 오름차순
        System.out.println(list);
        Collections.sort(list, Comparator.reverseOrder()); // 내림차순
        System.out.println(list);
    }
}
