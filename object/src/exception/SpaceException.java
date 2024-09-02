package exception;

// 사용자 정의 예외 클래스 설계
public class SpaceException extends Exception {
    // 디폴트 생성자
    public SpaceException() {
        super();
    }

    // message 생성자
    public SpaceException(String message) {
        super(message);
    }

}
