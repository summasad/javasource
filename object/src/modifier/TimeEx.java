package modifier;

// java.lang 패키지는 기본 import 되어 있음 => import 구문 필요 없음
import static java.lang.Math.*; //Math 클래스에 있는 모든구성요소 static으로 import

public class TimeEx {
    public static void main(String[] args) {
        // Time time = new Time();

        Time time1 = new Time();
        Time time2 = new Time();
        System.out.println(time1 == time2); // false

        // 싱글톤 패턴 이라는 개발방식
        // SingleTon singleTon = new SingleTon();
        // 인스턴스를 하나만 생성
        SingleTon singleTon1 = SingleTon.getInstance();
        SingleTon singleTon2 = SingleTon.getInstance();
        System.out.println(singleTon1 == singleTon2); // true

        // 0 <= x < 1 의 수 생성
        // 대문자 클래스 Math.메소드
        // 이 메소드는 static
        // java.lang.Math 에 선언된 클래스
        // Math : 생성자는 private / 멤버변수와 메소드가 static 상태
        System.out.println(Math.random());
        System.out.println(Math.PI);

        // Math 는 import 필요 없음
        // 하지만 static import 한 후 Math. 앞부분 생략할 수 있음
        System.out.println(PI);
        System.out.println(random());
        System.out.println(round(1.5));

        Card card = new Card("HEART", 10);

        System.out.println("number" + card.NUMBER);
        // NUMBER 나 KIND 변경 가능한지?
        // final field Card.NUMBER cannot be assigned, 변경 불가
        // card.NUMBER=15; 값 넣기 불가, 초기화 한 상태로 써야

    }
}
