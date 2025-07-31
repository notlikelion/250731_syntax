package step1;

import java.util.Scanner;

// 변수
public class Solution02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1 + 1 = ?
        System.out.println("1 + 1 = 2");
        // a + b = c;
//        int a = 1; // integer 정수 형태의 숫자 -> int -> +- 21억 범위를 커버 가능함
//        int b = 1; // 32비트 단위의 +- 정수 (signed 정수) -> 플마 기호 -> 4바이트
//        int c = a + b;
//        long d = 1; // 64비트 단위의 정수 -> 1천8백경 -> 9백경 -> 8바이트
        // 컴퓨터는 저장할 때 '메모리'에 공간을 할당을 한다
        // -> 이 메모리에 얼마나 공간을 할당할지 정해주는게 type(symbol).
        // -> 이 할당된 공간에 식별할 수 있는 중복되지 않은 이름을 정해준게 '변수'
        System.out.println("a + b = c");
        System.out.print("a : ");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.print("b : ");
        int b = sc.nextInt();
        sc.nextLine();
        int c = a + b;
        System.out.println(a + " + " + b + " = " + c);

        sc.close();
    }
}
