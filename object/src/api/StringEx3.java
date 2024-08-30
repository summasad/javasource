package api;

public class StringEx3 {
    public static void main(String[] args) {
        String[] names = { "Queen", "Tod", "Jerry", "Choi", "Kim", "Park" };

        String result = findKim(names);
        System.out.println(result);
    }

    static String findKim(String[] names) {
        // Kim 찾기
        int pos = 0;

        for (int j = 0; j < names.length; j++) {
            if (names[j].equals("Kim")) {
                pos = j;
                break;
            }
        }

        return "Kim 은 " + (pos + 1) + "에 있다";
    }

}
