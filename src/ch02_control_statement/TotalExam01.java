/*
이름과 국어, 영어, 수학 점수를 이용하여 학점을 매기세요.
학점은 세 과목의 평균을 이용하여 매기세요.

String name = "김철수";
int kor = 85, eng = 70, math = 90 ;

String grade ; // 학점 변수

String message = "" ;

학점이 "A" 또는 "B"이면 "참 잘 하셨습니다."를 message 변수에 저장한다.
학점이 "C" 또는 "D"이면 "조금만 더 노력하세요."를 message 변수에 저장한다.
학점이 "F"이면 "다음 학기에 재수강하세요."를 message 변수에 저장한다.
그 외의 값이 입력되면 "잘못된 입력입니다."를 message 변수에 저장한다.

출력 예시
이름 : 김철수님
국어 : 85점, 영어 : 70점, 수학 : 90점
총점 : 245점, 평균 : 81.66666
학점 : B
메시지 : 참 잘 하셨습니다.
*/
package ch02_control_statement;

public class TotalExam01 {
    static void main(String[] args) {

        //변수 선언
        String name = "김철수";
        int kor = 85, eng = 70, math = 90 ;

        String grade ; // 학점 변수

        String message = "" ;
        int total = kor + eng + math;
        double average =total/3.0;


        //평균으로 학점 구하기
        if (average>=90.0){
            grade = "A";
        }
        else if (average >=80.0){
            grade = "B";
        }
        else if (average>=70.0){
            grade = "C";
        }
        else if (average>=60.0){
            grade = "D";
        }
        else{
            grade = "F";
        }

        //학점으로 MESSAGE 입력하기
        switch (grade){
            case "A" : case "B" :
                message = "참 잘했습니다.";
                break;
            case "C" : case "D" :
                message = "조금만 더 노력하세요.";
                break;
            case "F" :
                message = "다음 학기에 재수강하세요.";
                break;
            default:
                message = "잘못된 입력입니다.";
        }

        //출력하기
        System.out.printf("이름 : %s님",name);
        System.out.println();

        System.out.printf("국어 : %d점, 영어 : %d점, 수학 : %d점",kor,eng,math);
        System.out.println();

        System.out.printf("총점 : %d점, 평균 : %.2f",total, average);
        System.out.println();

        System.out.printf("학점 : %s",grade);
        System.out.println();

        System.out.printf("메세지 : %s",message);
    }
}
