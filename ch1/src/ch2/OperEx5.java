package ch2;

public class OperEx5 {
    public static void main(String[] args) {
        // 비교 연산자 : > < >= <= ==(같은가) !=(같지않다)
        // 결과값이 논리값으로 출력

        int num1 = 10, num2 = 20;
        System.out.println("num1 == num2 = " + (num1 == num2));
        System.out.println("num1 != num2 = " + (num1 != num2));

        char ch1 = 'A', ch2 = 'B';
        int num3 = 65;

        // char 하고 int 비교 : 자동형변환 일어남
        System.out.println("ch1 == num3 = " + (ch1 == num3));
        System.out.println("ch1 <= ch2 = " + (ch1 <= ch2));

        // float, double
        float f1 = 0.1f;
        double d1 = 0.1;
        System.out.println("f1 == d1 = " + (f1 == d1));
        // false, float와 double 은 정밀도 차이가 있음. 비트 수도 다름, float은 0.1을 완벽하게 저장할수 없기 때문에 더블이
        // 안전

        // 문자열 비교
        // 문자와 문자열은 다름
        // c라는 문자 하나를 저장하고 싶다면 변수의 타입 지정시 char, String으로 처리 가능
        // ch 라는 하나이상의 문자를 저장하고 싶다면 변수 타입 지정시 String으로 처리 가능
        // 대문자로 시작하면 자바에서는 객채의 이미가 있음(객체 상태일 때 할 수 있는 것이 많다)
        // 자바에서는 문자열 생성하는 다양한 방법 때문에 저장되는 위치가 조금 다를 수 있다
        // 문자열의 비교는 == 를 사용하지 않음(결과가 달라질수 있기 때문에)

        String str1 = "홍길동", str2 = "홍길동";
        String str3 = new String("홍길동");
        System.out.println("str1 == str2 = " + (str1 == str2));
        System.out.println("str1 == str3 = " + (str1 == str3)); // false

        // equals() : 문자열 비교
        System.out.println("str1 == str3 = " + str1.equals(str3)); // true

        str1 = "animal";
        str2 = "Animal";
        System.out.println("str1 == str2 = " + str1.equals(str2));
        System.out.println("str1 == str2 = " + str1.equalsIgnoreCase(str2)); // 대소문자 구분없이 비교하고 싶을때

    }
}
