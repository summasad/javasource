package api;

import java.util.HashSet;
import java.util.Set;

public class SetEx1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("사과");
        set.add("배");
        set.add("수박");
        set.add("사과");
        set.add("복숭아");
        set.add("포도");
        set.add("배");

        System.out.println(set); // [배, 복숭아, 포도, 수박, 사과] 임의의 순서로 담김

        System.out.println("딸기 포함 여부 " + set.contains("딸기"));

        System.out.println("복숭아 삭제 " + set.remove("복숭아"));
        // 임의의 위치, 인덱스 삭제 안됨

        System.out.println("크기 " + set.size());
    }
}
