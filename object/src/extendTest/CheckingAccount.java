package extendTest;

// 은행 계좌  + 직불카드
public class CheckingAccount extends Account {

    // 카드번호
    private String cardNo;

    public CheckingAccount(String accountNo, String owner, int balance, String cardNo) {
        super(accountNo, owner, balance);
        this.cardNo = cardNo;

    }

    // 사용 금액을 지불한다.
    // pay() : 사용금액, 카드번호, 잔액 리턴
    // 카드번호 일치 시 금액 인출

    int pay(String cardNo, int amount) {
        if (!cardNo.equals(this.cardNo)) {
            return -1;
        }

        // 일치 시 금액 인출
        // 잔액 = 잔액 - 사용액;
        // balance = super.getBalance() - amount;
        // 출금하다 이용
        return withdraw(amount);

    }

}
