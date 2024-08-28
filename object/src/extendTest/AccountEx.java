package extendTest;

public class AccountEx {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount("110-205-3000", "홍길동", 10000000, "222-22");
        checkingAccount.deposit(100000);
        System.out.println("현재잔액 : " + checkingAccount.getBalance());

        //
        int balance = checkingAccount.pay("222-22", 20000);
        System.out.println("현재잔액 : " + balance);

        CreditLineAccount creditLineAccount = new CreditLineAccount("333-33", "현빈", 1000000, 5000000);

        System.out.println("마이너스 통장 계좌 잔액 확인 : " + creditLineAccount.getBalance());
        balance = creditLineAccount.withdraw(4000000);
        System.out.println("현재잔액 : " + balance);

        System.out.println("==============================================");
        BonusPointAccount bonusPointAccount = new BonusPointAccount("444-55", "김지수", 50000000, 200000);
        System.out.println("현재 보너스점수 : " + bonusPointAccount.getBonusPoint());

        System.out.println("==============================================");
        bonusPointAccount.deposit(200000);
        System.out.println("현재잔액 : " + bonusPointAccount.getBalance());
        System.out.println("현재 보너스 점수 : " + bonusPointAccount.getBonusPoint());

        System.out.println("==============================================");
        CheckingTrafficCardAccount cardAccount = new CheckingTrafficCardAccount("555-66", "김수용", 100000, "777-88");
        System.out.println(cardAccount.isHasTrafficCard() ? "교통카드 기능 있음" : "교통카드 기능 없음");

        // 교통카드 기능 추가
        cardAccount.setHasTrafficCard(true);

        // 교통비 지블
        balance = cardAccount.pay("555-66", 2400);
        if (balance == -1) {
            System.out.println("교통카드 기능이 없습니다");
        } else {
            System.out.println("지불후 잔액 : " + balance);
        }
    }
}
