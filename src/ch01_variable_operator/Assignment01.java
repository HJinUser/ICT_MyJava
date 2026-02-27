package ch01_variable_operator;

public class Assignment01 {
    static void main() {
        int x = 5; //정수형 변수 x에 숫자 5를 대입/할당(assign) 해주세요.
        System.out.println("x : " +x);

        x += 3; //5 + 3 = 8
        System.out.println("x : " +x);

        x *= 4; //8 * 4 = 32
        System.out.println("x : " +x);

        x %= 5; //32 % 5 = 2
        System.out.println("x : " +x);

        x -= 1; //2 - 1 = 1
        System.out.println("x : " +x);

        x += 5; //1 + 5 =6
        System.out.println("x : " +x);

    }
}
