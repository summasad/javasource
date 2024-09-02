package exception;

public class ExceptionEx1 {
    public static void main(String[] args) {
        int number = 100;
        int result = 0;
        for (int i = 0; i < 10; i++) {
            try {
                result = number / (int) (Math.random() * 10);
                System.out.println(result);

                int num = Integer.parseInt("abc");
                System.out.println(num);
            } catch (ArithmeticException | NumberFormatException e) {
                // ArithmeticException : 0으로 나눌때 나오는 exception
                // 정확한 exception으로 받을 수도 있음
                // 부모 exception으로 받아도 되고 예상되는 exception 나열해도 됨
                // System.out.println("0으로 나눴음");
                // e.printStackTrace();
                // 오류가 나는 모든 시점을 찍어줘라
                // 개발 할때 확인하기 위해
                // 개발이 끝난 다음에 바꾸기
                System.out.println(e.getMessage());
                // 적절한 메세지 출력

            }

        }
    }
}
