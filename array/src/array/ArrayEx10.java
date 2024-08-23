package array;

import java.util.Scanner;

public class ArrayEx10 {
    public static void main(String[] args) {
        // 원래 단어 맞추기
        Scanner sc = new Scanner(System.in);
        String[] words = { "television", "computer", "mouse", "phone" };

        for (int i = 0; i < words.length; i++) {
            // 문제 출제
            char[] question = words[i].toCharArray();
            for (int j = 0; j < question.length; j++) {
                int pos = (int) (Math.random() * question.length);

                char temp = question[j];
                question[j] = question[pos];
                question[pos] = temp;
            }
            System.out.printf("Q%d) %s의 원래 단어는 무엇일까요?", i + 1, new String(question));

            // 답변 입력
            // 사용자의 답변이 원래 단어와 일치하는지 확인
            String answer = sc.nextLine();

            if (answer.equals(words[i])) {
                System.out.println("정답습니다");
            } else {
                System.out.println("틀렸입니다");

            }
            sc.close();
        }

    }
}
