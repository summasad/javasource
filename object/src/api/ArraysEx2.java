package api;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysEx2 {
    public static void main(String[] args) {
        String[] strArr = { "cat", "dog", "lion", "tiger" };
        // Arrays.sort(T, E, K, V : 객체 상태로 들어가야함)
        Arrays.sort(strArr, Comparator.reverseOrder());

        int arr[] = { 37, 21, 56, 99, 88, 58, 62, 15, 39, 78 };

        // 오름차순
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        // 내림차순
        // Arrays.sort(arr, Comparator.reverseOrder()); 오류남, int 라서

        // Comparator 할때 객체화
        // int => Integer chr => Character float => Float...
        Integer arr2[] = { 37, 21, 56, 99, 88, 58, 62, 15, 39, 78 };
        Arrays.sort(arr2, Comparator.reverseOrder());
        System.out.println(Arrays.toString(arr2));

    }
}
