package step1;

import java.math.BigDecimal;
import java.util.Scanner;

// 변수
public class Solution02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 우리가 Scanner 도구를 써서 sc에다가 연결.
        // 1 + 1 = ?
//        System.out.println("1 + 1 = 2");
        // a + b = c;
//        int a = 1; // integer 정수 형태의 숫자 -> int -> +- 21억 범위를 커버 가능함
//        int b = 1; // 32비트 단위의 +- 정수 (signed 정수) -> 플마 기호 -> 4바이트
//        int c = a + b;
//        long d = 1; // 64비트 단위의 정수 -> 1천8백경 -> 9백경 -> 8바이트
        // 컴퓨터는 저장할 때 '메모리'에 공간을 할당을 한다
        // -> 이 메모리에 얼마나 공간을 할당할지 정해주는게 type(symbol).
        // -> 이 할당된 공간에 식별할 수 있는 중복되지 않은 이름을 정해준게 '변수'
//        System.out.println("a + b = c");
//        System.out.print("a : ");
//        int a = sc.nextInt();
//        sc.nextLine();
//        System.out.print("b : ");
//        int b = sc.nextInt();
//        sc.nextLine();
//        int c = a + b;
//        System.out.println(a + " + " + b + " = " + c);

        System.out.print("시력을 입력해주세요 : ");
        // float, double
        // 1.1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111
//        float eye = sc.nextFloat();
//        float eye = 1.1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111F;
//        double eye = sc.nextDouble();
        BigDecimal eye = sc.nextBigDecimal(); // 부동소수점 이슈를 상당히 해결함.
        // 부동소수점 이슈 -> 자바 버전마다 달라요
        // 컴퓨터는 2진수인데, 소수점은 10진수 -> 이거를 표현하려다보니 오차가 있음
        System.out.println("당신의 시력은 " + eye);
        sc.close();

        // https://g.co/gemini/share/28c12be7c156
        // jvm, gc에 대해서 (변수-메모리)

//        int a = 30000000000; // a란 이름을 2번 쓰면 안된다
//        a = a + 1;
        int a = 1_000_000_000; // 3자리 기준으로 _로 구분할 수 있음
        long b = 30_000_000_000L; // Long은 L을 붙여줘야함
        a = a + 1;
        System.out.println(a + b);
    }
}
