package classtest;

import java.util.Scanner;

public class AccountEx2 {

    // 멤버 변수 선언 가능
    static Account[] accounts = new Account[100];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("======================================================");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4. 출금 | 5.종료");
            System.out.println("======================================================");
            System.out.println("메뉴 선택 >> ");

            // int menu = sc.nextInt(); 했을때 입력값 이후 엔터가 들어감
            // case 1 에서 입력값이 복수일때 첫번째 입력값 자리에 엔터가 들어감
            // 아래와 같이 바꾸면 엔터를 남기지 않을 수 있음
            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:
                    // 계좌 생성 메소드 호출
                    creatAccount();
                    break;
                case 2:
                    // 계좌 목록 메소드 호출
                    accountList();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:

                    break;
                case 5:
                    run = false;
                    System.out.println("프로그램 종료");
                    break;
                default:
                    System.out.println("메뉴 번호를 확인해 주세요");
                    break;
            }

        }

    }

    static void creatAccount() {
        // 계좌생성 담당 메소드
        // 계좌와 관련된 정보 입력받기(계좌번호, 이름, 금액)
        // 아래와 같이 한번 입력받아야 생성
        // accounts[특정인덱스] = new Account("111-111", "성춘향", 100000);
        System.out.println("계좌 번호를 입력하세요 >> ");
        String accNo = sc.nextLine();
        System.out.println("이름을 입력하세요 >> ");
        String accOw = sc.nextLine();
        System.out.println("입금할 금액을 입력하세요 >> ");
        int bal = Integer.parseInt(sc.nextLine());

        // 배열 요소에서 빈 공간을 찾아서 채우기
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = new Account(accNo, accOw, bal);
                System.out.println("계좌 생성 완료");
                break;
            }
        }

    }

    static void accountList() {
        // 현재 생성된 계좌목록 출력
        System.out.println("======================================================");
        System.out.println("계좌               이름              잔액 ");
        System.out.println("======================================================");
        for (Account account : accounts) {
            if (accounts != null) {
                System.out.printf("%s\t%s\t%d\n", account.getAccountNo(), account.getOwner(), account.getBalance());
                break;
                // 주소가 아니라 값을 출력할 거니까 account.getter
            }
        }

    }

    static void deposit() {
        // 예금하기
        // 계좌번호와 예금액 입력받기
        System.out.println("계좌 번호 >> ");
        String guestAcc = sc.nextLine();
        System.out.println("입금할 금액을 입력하세요 >> ");
        int amount = Integer.parseInt(sc.nextLine());

        // 배열 요소에서 일치하는 계좌번호를 찾기
        // 찾은 account 의 deposit() 메소드 호출
        Account account = findAccount(guestAcc);
        if (account != null) {
            account.deposit(amount);
        }

        // for (Account account : accounts) {
        // if (account != null) {
        // if (guestAcc.equals(account.getAccountNo())) {
        // // 일치하는지 확인할때 equals
        // account.deposit(amount);
        // break;
        // }
        // }
        // }

    }

    static void withdraw() {
        // 출금하기
        // 계좌번호와 출금액 입력하기
        System.out.println("계좌 번호 >> ");
        String guestAcc = sc.nextLine();
        System.out.println("출금할 금액을 입력하세요 >> ");
        int amount = Integer.parseInt(sc.nextLine());

        // 배열에서 일치하는 계좌번호 찾기
        // account withraw() 메소드 호출
        // 잔고 부족하면 알려주기
        Account account = findAccount(guestAcc);
        if (account != null) {
            account.withdraw(amount);
        }
        sc.close();
    }

    static Account findAccount(String guestAcc) {
        // 일치하는 account 리턴
        // 리턴하는 타입 맞춰주기
        for (Account account : accounts) {
            if (account != null) {
                if (guestAcc.equals(account.getAccountNo())) {
                    return account;
                }
            }
        }
        return null;

    }

}
