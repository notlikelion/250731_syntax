package step1;

// [접근제어자] [구현체종류] [이름] {}
public class Solution01 {
    // ✅ PascalCase - 영어로 작성되어 있는데 띄어쓰기 대신 모두 대문자를 쓰는 형태의 작성법
    // - 클래스 계열
    // ✅ camelCase - (...) 첫 문자가 소문자인 경우
    // - 나머지 메서드나 변수명 등
    // snake_case : 띄어쓰기를 (_)로 처리
    // SCREAMING_SNAKE_CASE : snake case인데 전부 대문자
    // kebab-case : 띄어쓰기를 (-)로 처리
    // 들어오는 길.
    public static void main(String[] args) {
        // 출력
        System.out.println("큰따옴표로 묶인 것을 출력한다");
        System.out.println(123456);

        System.out.print("뭔 차이지?"); // 줄바꿈이 없다
        System.out.print("뭔 차이지?");
//        System.out.print("뭔 차이지?" + "\n");
//        System.out.print("뭔 차이지?\n");
//        \n -> escape 문자
        System.out.println("뭔 차이지?"); // 알아서 줄바꿈을 해준다
        System.out.println("뭔 차이지?");
    }
}
