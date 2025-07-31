package step2;

import java.util.Scanner;

public class GeminiChat {
    // main
    // 입출력
    // 변수, 타입
    public static void main(String[] args) {
        // 입력 : 질문을 받아서
        Scanner sc = new Scanner(System.in); // 터미널을 통한 입력
        System.out.print("질문을 입력해주세요 \uD83D\uDE3B: ");
        String question = sc.nextLine();
        System.out.println("당신의 질문은 " + question + "입니다.");
        // Gemini와 통신하는 로직은요?
        // 저한테 받아서 해야죠 뭐...
        // 출력 : Gemini
    }
}
