package ch03_array;

import java.util.Scanner;

public class StudentExam {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("이름 입력 : ");
        String name = scan.nextLine();

        int[] score = new int[100];
        int total=0;


        String[] sub = {"국어", "영어", "수학", "한문", "정보"};
        for(int i=0;i<sub.length;i++){
            System.out.print("  "+sub[i]+"점수 입력 : ");
            score[i]=scan.nextInt();
            total+=score[i];
        }

        double average = (double)total/sub.length;
        System.out.println("\n학생의 정보");
        System.out.printf("이름 : %s, 총점 : %d, 평균 : %.2f",name, total, average);
    }
}
