package ch01_variable_operator;

public class Condition02 {
    static void main() {
        int x = 10, y=20;

        // 2개의 숫자 중에서 큰 수 고르기
        //조건식 ? 참일때처리 : 거짓일때처리
        int result = x > y ? x : y;
        System.out.println("result : "+result);

        //x가 짝수인지 홀수인지 판단해 보세요.
        String str = x%2==0?"짝수":"홀수";

        System.out.println("결과 : "+str);

        x=6;
        //x가 3의 배수이면 제곱을, 아니면 더하기 5의 결과 출력하기
        result = (x%3==0)?x*x:x+5;
        System.out.println("result : "+result);


        int month =3;
        //month가 봄인지 봄이 아닌지 출력하기
        //3보다 크거나 같고, 5보다 작거나 같기
        //봄입니다, 봄이 아닙니다 -> 문자열로 출력하기
        str = month >=3 && month<=5 ? "봄입니다.":"봄이 아닙니다.";
        System.out.println("결과 : "+str);
    }
}