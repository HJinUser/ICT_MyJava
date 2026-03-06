package ch02_control_statement;


import java.util.Scanner;

public class While03 {
    static void main() {
        int answer = 40; //컴퓨터가 생각하고 있는 숫자

        //바코드 스캐너 scan를 준비합니다.
        Scanner scan = new Scanner(System.in);

        while (true) { // endless while loop
            int input = scan.nextInt();
            System.out.println("입력한 숫자 : " + input);

            if (answer == input) {
                System.out.println("정답입니다.");
                break;

            } else if (answer > input) {
                System.out.println(input + "보다 큰 수입니다.");

            } else {
                System.out.println(input + "보다 작은 수입니다.");
            }

        }


    }
}