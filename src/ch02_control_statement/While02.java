package ch02_control_statement;

public class While02 {
    static void main(String[] args) {
        int i =1, odd=0, even=0;
        while (i<11){
            switch (i%2){
                case 1:
                    odd+=i;
                    break;
                case 0:
                    even+=i;
            }
            i++;
        }
        System.out.printf("짝수의 합은 %d입니다",even);
        System.out.println();
        System.out.printf("홀수의 합은 %d입니다",odd);
    }
}
