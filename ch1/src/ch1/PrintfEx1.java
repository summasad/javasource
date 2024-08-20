package ch1;

public class PrintfEx1 {
    public static void main(String[] args) {
        char ch1 = 'A';
        System.out.printf("ch1 = %c\n", ch1);
        System.out.printf("ch1 = %10c\n", ch1);

        double d1 = 3.1415d;
        System.out.printf("d1 = %f\n", d1);
        System.out.printf("d1 = %10f\n", d1);
        System.out.printf("d1 = %10.2f\n", d1);
    }
}
