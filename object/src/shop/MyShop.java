package shop;

import java.util.Scanner;

public class MyShop implements IShop {

    // Myshop 사용하는 User 배열 생성
    User users[] = new User[2];

    // 상품 배열 생성
    Product productList[] = new Product[5];

    // cart 생성
    Product cart[] = new Product[10];

    private String title = "";

    @Override
    public void setTitle(String title) {
        this.title = title;

    }

    @Override
    public void genUser() {
        // user 2명을 생성 후 users 배열에 담기
        users[0] = new User("홍길동", PayType.CARD);
        users[1] = new User("성춘향", PayType.CASH);

    }

    @Override
    public void genProduct() {
        // CellPhone, SmarTv 5개 생성 후 productList 배열에 담기
        productList[0] = new CellPhone("아이폰 13", 1500000, "KT");
        productList[1] = new CellPhone("갤럭시 노트 13", 1200000, "SKT");
        productList[2] = new CellPhone("갤럭시 Z 플립", 1300000, "LG");
        productList[3] = new SmartTv("삼성 울트라 HD", 1800000, "4K");
        productList[4] = new SmartTv("LG 스마트", 1400000, "1080p");
    }

    Scanner sc = new Scanner(System.in);

    // 선택된 user의 index 보관
    public int selUser;

    @Override
    public void start() {
        // 출력
        // MyShop : 메인화면 - 계정선택
        // ===================================
        // [1] 홍길동(CARD)
        // [2] 성춘향(CASH)
        // [x] 종료
        // 선택 >>

        System.out.println(title + " : 메인화면 - 계정선택");
        System.out.println("=================================");
        for (int i = 0; i < users.length; i++) {
            System.out.printf("[%d] %s(%s)\n", (i + 1), users[i].getName(), users[i].getPayType());
        }
        System.out.println("[X] 종료");
        System.out.println("선택 >> ");
        // 사용자 입력 : 1,2,X
        // 사용자 입력이 1,2 인 경우 productList() 호출
        // X인 경우 System.exit(0)
        String choice1 = sc.nextLine();
        switch (choice1) {
            case "1":
            case "2":
                selUser = Integer.parseInt(choice1);
                productList();
                break;
            case "X":
            case "x":
                System.exit(0);
                break;
            default:
                System.out.println("입력을 확인해주세요");
                start();
                break;
        }

    }

    public void productList() {
        // 출력
        // MyShop : 상품목록 - 상품선택
        // ===================================
        // [1] 상품 보여주기
        // [2] 상품 보여주기
        // [3] 상품 보여주기
        // [4] 상품 보여주기
        // [5] 상품 보여주기
        // [h] 메인화면
        // [c] 체크아웃
        // 선택 >>

        System.out.println(title + " : 상품목록 - 상품선택");
        System.out.println("=================================");
        int i = 0;
        for (Product product : productList) {
            System.out.printf("[%d]", i++);
            product.printDetail();
        }
        System.out.println("[h] 메인화면");
        System.out.println("[c] 체크아웃");
        System.out.println("선택 >> ");

        String choice2 = sc.nextLine();

        // 0~4 or h or c
        // h 메인화면
        // c checkOut 호출
        // 0~4는 카트에 담기 : cart[10]

        switch (choice2) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
                // 0~4 :cart에 담기
                for (int j = 0; j < cart.length; j++) {
                    if (cart[j] == null) {
                        cart[j] = productList[Integer.parseInt(choice2)];
                        break;
                    }
                }
                productList();
                break;
            case "h":
                start();
                break;
            case "c":
                checkOut();
                break;
            default:
                System.out.println("입력을 확인해 주세요");
                productList();
                break;
        }

    }

    public void checkOut() {
        // 카트를 화면에 출력
        System.out.println();
        System.out.println(title + "-" + users[selUser].getName() + " : 체크아웃");
        System.out.println("=================================");
        int i = 0, sum = 0;
        for (Product product : cart) {
            if (product != null) {
                System.out.printf("[%d] $s (%d)\n", i++, product.getpName(), product.getPrice());
                sum += product.getPrice();
            }
        }

        // 사용자에 따른 결제방법 : CARD of CASH
        System.out.println("결제방법 : " + users[selUser].getPayType());

        // 합계 : 카트에 담긴 물건
        System.out.println("합계 : " + sum);
        // [p] 이전
        System.out.println("[p] 이전");
        // [q] 결제완료
        System.out.println("[q] 결제완료 ");
        // 입력값에 따라
        String input = sc.nextLine();
        // p : 상품목록 화면 보여주기
        switch (input) {
            case "p":
                productList();
                break;
            case "q":
                // q : 종료
                System.exit(0);
                break;

            default:
                System.out.println("입력값을 확인해주세요");
                checkOut();
                break;
        }
    }
}
