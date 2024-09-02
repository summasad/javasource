package classtest;

public class AccountEx {
    public static void main(String[] args) {
        Account account = new Account("123-1234-1234", "홍길동", 10000000);

        System.out.println("계좌 : " + account.getAccountNo() + "계좌주 : " + account.getOwner()
                + "잔액 : " + account.getBalance());

        // 예금하다
        account.deposit(100000);

        // 잔액조회
        System.out.println("입금 후 잔액 : " + account.getBalance());

        // 출금하다

        int balance = account.withdraw(500000);
        if (balance == -1) {
            System.out.println("잔액부족");
        } else {
            System.out.println("출금 후 잔액 : " + balance);

        }

        printAccount(account);

    }

    // 메소드 안 변수명은 상관없음
    // L 26에서 보낸 값을 불러오는 주소
    static void printAccount(Account acc) {

    }

}
