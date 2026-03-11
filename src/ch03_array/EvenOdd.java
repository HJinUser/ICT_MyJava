package ch03_array;

import java.util.Scanner;

public class EvenOdd {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("배열 요소 개수 입력 : "); //바로 옆에서 입력하려고 print 사용
        int size = scan.nextInt();

        int[] score = new int[size];
        int odd = 0, even = 0;

        for (int i = 0; i < score.length; i++) {
            System.out.print(i + 1 + "번째 정수 입력 : ");
            score[i] = scan.nextInt();

            if (score[i] % 2 == 0) {
                even += score[i];
            } else {
                odd += score[i];
            }
        }

        System.out.println("홀수의 총합 : " + odd);
        System.out.println("짝수의 총합 : " + even);
    }
}
