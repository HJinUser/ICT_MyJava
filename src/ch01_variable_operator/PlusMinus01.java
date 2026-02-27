package ch01_variable_operator;

public class PlusMinus01 {
    static void main() {
        int a, b, c;

        a=10;
        b=20;
        ++a; //현재 a = 11
        b--; // b = 19

        c = ++a + b--; //12 + 19 = 31   /  이 연산이 끝나고 b는 1 줄어듦

        System.out.println("a : "+ a);
        System.out.println("b : "+ b);
        System.out.println("c : "+ c);



    }
}
