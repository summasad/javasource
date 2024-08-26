package classtest;

public class DataEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        // change(d.x); : 값 복사 (d.x -> d의 x 는 int, 값 복사)
        change(d); // 주소 복사 (d -> d 는 Data, 주소 복사)
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x);

    }

    // static void change(int x) {
    // x = 10000;
    // System.out.println("change() : x " + x);
    // }

    static void change(Data d) {
        d.x = 10000;
        System.out.println("change() : x " + d.x);
    }
}
