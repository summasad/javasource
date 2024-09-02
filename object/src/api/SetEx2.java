package api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEx2 {
    public static void main(String[] args) {
        // 1~46 임의의 숫자를 6개 추출 후 Set에 담기
        Set<Integer> set = new HashSet<>();

        while (set.size() < 6) {
            int num = (int) (Math.random() * 46 + 1);
            set.add(num);
        }

        // set.add((int) (Math.random() * 46 + 1));

        System.out.println(set);

        // 정렬 - 임의의 순서라 구현되어있지 않음,
        // set.sort 없음
        // 부모 Collections.sort() 안됨
        // Set => List로 변환해서 정렬
        List<Integer> list = new ArrayList<>(set); // 생성자
        Collections.sort(list);
        System.out.println(list);

    }
}
