package classtest;

public class AccountEx3 {
    public static void main(String[] args) {
        Account2 account2 = new Account2("111", "홍길동", 100000);
        System.out.println(account2); // classtest.Account2@5ca881b5 heap주소 출력
        // toString 오버라이딩 하면 주소대신 값 간편하게 출력
        // 클래스에 Override

        Account2 accounts[] = new Account2[2];
        accounts[0] = new Account2("111", "홍길동", 1000000);
        accounts[1] = new Account2("222", "성춘향", 2000000);

        for (Account2 account22 : accounts) {
            System.out.println(account22);
        }
    }

}
