package ch2;

public class OperEx3 {
    public static void main(String[] args) {
        // 534 자루의 연필을 30명의 학생들에게 똑같은 개수로 나눌 때 학생 한 명당 몇개를
        // 나눠가질 수 있고 최종적으로 몇 개가 남는지 출력하기
        // 조건) 변수 사용

        int pencil = 534;
        int stu = 30;

        // System.out.println("534 자루의 연필을 30명의 학생들에게 똑같은 개수로 나눌 때");
        // System.out.println("학생 한 명당 가질 수 있는 연필은 " + pencil / stu + " 개 이고");
        // System.out.println("남은 연필 개수는 " + pencil % stu + " 개 이다");

        System.out.printf("학생 한 명 당 %d 자루\n", (pencil / stu));
        System.out.printf("남은 연필 %d 자루\n", (pencil % stu));

        // 사다리꼴의 넓이 구한 후 출력하기
        // 윗변 5 아랫변 10 높이 7
        // 조건) 변수 사용 소수점까지

        // float up = 5, down = 10, len = 7;
        // System.out.printf("사다리꼴 넓이는 %f 자루\n", ((up + down) * len)/ 2);

        int up = 5, down = 10, len = 7;
        double result = (double) (up + down) * len / 2; // int를 실수로 변환하기 위해 double 하거나 2.0으로 값 하나를 실수화 해주기
        // double result = (up + down) * len / 2.0;
        System.out.printf("사다리꼴 넓이는 %f 자루\n", result);

        // 변수 num의 값보다 크면서 가장 가까운 10의 배수에서 변수 num 의 값을 뺀 나머지를 구한 후 출력
        // 예들 들어 24라면 24보다 크면서 가장 가까운 10의 배수는 30-24=6 이므로 결과 6이 출력되도록 한다

        // int num1 = 24;
        // int num2 = num1 / 10;
        // int num3 = ++num2 * 10;

        // System.out.printf("가장 가까운 10의 배수는 %d 이다\n", ++num2 * 10);
        // System.out.printf("구하는 값은 %d 이다\n", (num3 - num2));

        int num = 88;
        System.out.println(10 - (num % 10));
    }

}
