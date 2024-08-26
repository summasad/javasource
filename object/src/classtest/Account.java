package classtest;

public class Account {
    // 계좌번호(accountNo) : 101-11-12345
    // 계좌주(owner) : 홍길동
    // 잔액(balance) : 10000000
    private String accountNo;
    private String owner;
    private int balance;

    public Account(String accountNo, String owner, int balance) {
        this.accountNo = accountNo;
        this.owner = owner;
        this.balance = balance;
    }

    // 기능
    // 예금하다(deposit)
    // 잔액=잔액+예금액
    // 리턴 없음
    void deposit(int amount) {
        balance += amount;
    }

    // 출금하다(withdraw)
    // 잔액=잔액-출금액
    // 잔액 return

    int withdraw(int amount) {

        if (amount > balance) {
            return -1;
        }
        balance -= amount;
        return balance;

    }

    public String getAccountNo() {
        return accountNo;
    }

    public int getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

}
