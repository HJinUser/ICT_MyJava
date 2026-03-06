package ch02_control_statement;

import java.util.Scanner;

public class While04 {
    static void main(String[] args) {
        int total = 0;
        double average = 0.0;
        int count=0;

        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("점수를 입력해주세요");
            int score=scan.nextInt();

            if(score<0){
                System.out.println("음수이므로 종료합니다.");
                break;
            }

            total += score;
            count++;

        }
        average = (double)total/count;
        System.out.println("total : " + total);
        System.out.println("average : "+average);
    }
}
