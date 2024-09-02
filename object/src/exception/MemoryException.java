package exception;

// 사용자 정의 예외 클래스 설계
public class MemoryException extends Exception {
    // 디폴트 생성자
    public MemoryException() {
        super();
    }

    // message 생성자
    public MemoryException(String message) {
        super(message);
    }

}
