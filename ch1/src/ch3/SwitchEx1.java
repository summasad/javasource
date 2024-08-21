package ch3;

public class SwitchEx1 {
    public static void main(String[] args) {
        // switch : if ~ else if ~ else 대체

        // switch (char or String or int) {
        // case value:

        // break;

        // default:
        // break;
        // }
        // }

        int random = (int) (Math.random() * 6) + 1;

        // System.out.println("random" + random);

        // if (random == 1) {
        // System.out.println("주사위 1이 나옴");
        // } else if (random == 2) {
        // System.out.println("주사위 2가 나옴");
        // } else if (random == 3) {
        // System.out.println("주사위 3이 나옴");
        // } else if (random == 4) {
        // System.out.println("주사위 4가 나옴");
        // } else if (random == 5) {
        // System.out.println("주사위 5가 나옴");
        // } else if (random == 6) {
        // System.out.println("주사위 6이 나옴");

        switch (random) {
            case 1: // random ==1
                System.out.println("주사위 1이 나옴");
                break;

            case 2: // random ==2
                System.out.println("주사위 2가 나옴");
                break;

            case 3: // random ==3
                System.out.println("주사위 3이 나옴");
                break;

            case 4: // random ==4
                System.out.println("주사위 4가 나옴");
                break;

            case 5: // random ==5
                System.out.println("주사위 5가 나옴");
                break;

            default: // else
                System.out.println("주사위 6이 나옴");
                break;
        }
    }

}
