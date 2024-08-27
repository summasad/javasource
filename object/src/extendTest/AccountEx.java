package extendTest;

public class AccountEx {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount("110-205-3000", "홍길동", 10000000, "222-22");
        checkingAccount.deposit(100000);
        System.out.println("현재잔액 : " + checkingAccount.getBalance());

        //
        int balance = checkingAccount.pay("222-22", 20000);
        System.out.println("현재잔액 : " + balance);

    }
}
