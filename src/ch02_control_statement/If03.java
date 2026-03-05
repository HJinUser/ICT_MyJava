package ch02_control_statement;

public class If03 {
    static void main() {
        int jumsu = 75;

        //학점 매기기
        // A B C D F 로 구분하기
        if (jumsu >= 90) {
            System.out.println("A 학점");
        }
        else if(jumsu>=80){
            System.out.println("B 학점");
        }
        else if(jumsu>=70){
            System.out.println("C 학점");
        }
        else if(jumsu>=60){
            System.out.println("D 학점");
        }
        else {
            System.out.println("F 학점");
        }
    }
}
