package exception;

public class AccountEx {
    public static void main(String[] args) {
        Account account = new Account("110-205-3000", "홍길동", 10000);

        // try {
        // account.withdraw(500000);
        // } catch (Exception e) {
        // e.printStackTrace();
        // }

        account.withdraw(5000000);

    }
}
