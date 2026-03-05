package ch02_control_statement;

public class If01 {
    static void main() {
        // su가 짝수이면 출력해주세요.
        int su = 1262142;

        if (su % 2 == 0) {
            System.out.println(su + "는 짝수입니다.");
        }

        System.out.println("나는 무조건 실행됩니다.");
    }
}
