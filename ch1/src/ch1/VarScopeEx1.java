package ch1;

public class VarScopeEx1 {
    public static void main(String[] args) {
        // 변수 유효범위는 선언한 블록내

        int a = 25;
        int c;

        {
            int b = 35;
            System.out.println(b);
            c = b + 50;
        }
        // System.out.println(b);
        System.out.println(a);
        System.out.println(c);

    }
}
