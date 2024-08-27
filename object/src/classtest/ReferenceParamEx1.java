package classtest;

public class ReferenceParamEx1 {
    public static void main(String[] args) {

        int[] arr = { 3, 2, 1, 6, 5, 4 };

        printArr(arr);
        sortArr(arr);
        printArr(arr);
        System.out.println("배열 총합 = " + sumArr(arr));

    }

    static void printArr(int[] arr) {
        System.out.print("[");

        for (int i : arr) {
            System.out.print(i + ",");
        }
        System.out.println("]");
    }

    static int sumArr(int[] arr) {
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    static void sortArr(int[] arr) {
        // 정렬 알고리즘
        // 1. 선택 정렬
        // 2. 버블
        // 3. 퀵
        // 버블 정렬 예시=>
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                } // 오름차순 정렬
            }
        }
    }
}
