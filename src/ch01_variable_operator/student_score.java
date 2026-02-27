package ch01_variable_operator;

public class student_score {
    static void main() {
        String name = "권혜진";
        double Kor = 40.0;
        double Eng = 43.0;
        double avg = (Kor + Eng) /2;

        System.out.println("이름 : "+name);
        System.out.println("국어 : "+Kor);
        System.out.println("영어 : "+Eng);
        System.out.println("평균 : "+avg);

    }
}
