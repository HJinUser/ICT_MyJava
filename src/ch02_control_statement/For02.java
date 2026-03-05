package ch02_control_statement;

public class For02 {
    static void main() {
        //1부터 10까지의 정수 중에서 짝수와 홀수의 합을 각각 구해주세요.
        int odd = 0, even = 0;

        for (int i = 1; i < 11; i++) {
            if (i%2==0){
                even +=i;
            }
            else{
                odd +=i;
            }
        }

        System.out.println("홀수의 합 : " + odd);
        System.out.println("짝수의 합 : " + even);

    }
}
