package step2;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
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
        // Gemini와 통신하는 로직은요? -> 저한테 받아서 해야죠 뭐...
        // API_KEY
        // https://aistudio.google.com/apikey > 동의
        // API 키 만들기
        // 예시 : AIzaSyCcCvoj9SJdLKiBjCl********
        HttpClient client = HttpClient.newHttpClient(); // 요청을 보내주는 친구
        String GEMINI_API_KEY = "AIza******";
        // 이건 절대 푸시하면 안된다 (open 되면 안된다... 이거 open하면 구글이 알아서 차단해줌)
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://generativelanguage.googleapis.com/v1beta/models/gemini-2.0-flash:generateContent"))
                .headers("Content-Type", "application/json",
                        "X-goog-api-key", GEMINI_API_KEY)
                .POST(HttpRequest.BodyPublishers.ofString(
                        // """ : Text Block 문법
                """
                    {
                        "contents": [
                          {
                            "parts": [
                              {
                                "text": "%s"
                              }
                            ]
                          }
                        ]
                      }
                    """.formatted(question)
                ))
                .build(); // 요청 자체
        try {
            // 요청으로 받은 응답
            HttpResponse<String> response = client.send(request,
                    HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        // 출력 : Gemini
    }
}
