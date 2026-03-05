package ch02_control_statement;

public class Switch01 {
    static void main() {
        //주사위 눈금의 수가 짝수인지 홀수인지 판단하기
        int su = 5;
        switch (su) {
            case 1:
                System.out.println("홀수");
                break;
            case 2:
                System.out.println("짝수");
                break;
            case 3:
                System.out.println("홀수");
                break;
            case 4:
                System.out.println("짝수");
                break;
            case 5: //여기로 한번에 이동
                System.out.println("홀수");
                break;
            case 6:
                System.out.println("짝수");
                break;
        }

        System.out.println("중급자가 코딩하는 방식");
        su = 10;
        switch (su){
            case 1: case 3: case 5:
                System.out.println("홀수");
                break;
            case 2: case 4: case 6:
                System.out.println("짝수");
                break;

            default: //case에 열거되지 않는 항목이 오면 여기가 실행됩니다.
                System.out.println("잘못된 숫자 형식입니다.");

        }
    }
}
