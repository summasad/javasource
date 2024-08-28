package extendTest;

//은행계좌 + 마이너스 가능한 계좌
public class CreditLineAccount extends Account {

    private int creditLine; // 마이너스 한도

    public CreditLineAccount(String accountNo, String owner, int balance, int creditLine) {
        super(accountNo, owner, balance); // 부모 생성자 호출, 첫줄에 존재
        this.creditLine = creditLine;

    }

    @Override
    int withdraw(int amount) {
        // 잔액 + 마이너스 한도 - 사용금액 = 마이너스 가능
        if (amount > getBalance() + creditLine) {
            return -1;

        }
        setBalance(getBalance() - amount);
        return getBalance();
    }

    public int getCreditLine() {
        return creditLine;
    }

}
