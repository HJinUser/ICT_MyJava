package ch02_control_statement;

public class ForSwitch01 {
    static void main(String[] args) {
        int odd=0, even=0;
        for(int i=1;i<11;i++){
            switch (i%2){
                case 0:
                    even+=i;
                    break;
                case 1:
                    odd +=i;
            }
        }
        System.out.printf("짝수의 합은 %d, 홀수의 합은 %d입니다.",even, odd);
    }
}

