package ch01_variable_operator;

public class CondOper {
    static void main() {
        // 3개의 정수 중에서 가장 큰 숫자를 구해봅니다.
        // 최대 값 변수 이름 max
        // int x=3, y=8, z=4;
        //int max

        int x=3, y=8, z=4, max;
        max=x>y?(x>z?x:z):(y>z?y:z);

        System.out.println("출력결과 : "+x+", "+y+", "+z+" 중 최댓값은 "+max+"입니다.");

    }
}
