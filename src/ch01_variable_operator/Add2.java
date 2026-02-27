package ch01_variable_operator;

public class Add2 {
    static void main() {
        //변수 3개 필요. int 형식의 변수 3개 선언
        int a;
        int b;
        int c;


        //각 변수에 목표값 넣기
        a = 3;
        b = 4;
        c = 5;

        //result 값 만들기
        int result = 2 * a + 3 * b - c; //2*3 + 3*4 - 5 = 13


        //출력
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("result = " + result);


    }
}
