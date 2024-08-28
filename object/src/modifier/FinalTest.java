package modifier;

public final class FinalTest {
    // 클래스에 final 붙여서 상속불가
    // 조상 클래스 될 수 없음

    final int MAX_SIZE = 10;
    // 상수 선언(상수는 값의 변화가 없어서 대문자로 선언)

    // final int getMaxSize(){
    // final 메소드 == 오버라이딩 금지
    // final int LV - MAX_SIZE;
    // final 지역변수 == 상수와 같은 역할
    // return MAX_SIZE;
    // }
}
