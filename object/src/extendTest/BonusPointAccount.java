package extendTest;

//은행 계좌 + 보너스 포인트 지급
public class BonusPointAccount extends Account {

    // 멤버변수
    // 초기화를 해줌(지역변수와의 차이점)
    // 기본타입(소문자) - 정수형 초기화 : 0 / 실수형 초기화 : 0.0 / 논리형 초기화 : false / 문자형 초기화 : ''
    // 참조타입(배열, 클래스) - int[] arr = new int[3] : 초기화 null //배열
    // String str; : 초기화 null // 클래스
    private int bonusPoint;

    public BonusPointAccount(String accountNo, String owner, int balance, int bonusPoint) {
        super(accountNo, owner, balance);

    }

    // 예금시 보너스 포인트 추가
    // 예금액 1% 보너스 포인트 적립
    // 예금하다 + 보너스 포인트 적립

    @Override
    void deposit(int amount) {
        // 예금하다
        super.deposit(amount);
        // 보너스 포인트 적립
        bonusPoint = bonusPoint + (int) (amount * 0.01);

    }

    // 보너스 포인트 조회
    public int getBonusPoint() {
        return bonusPoint;
    }

}
