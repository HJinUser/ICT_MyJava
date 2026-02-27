package ch01_variable_operator;

public class Add {
    static void main() {
        //3+5=8 입니다
        //변수 정의(선언)
        int x; //정수형 데이터를 위하여 x를 준비하세요
        int y;
        int result;

        // 변수에 값을 할당 (대입)
        x=3; //쓰기
        y=5;
        result=x+y; //+기호는 덧셈. x와 y을 읽어와서 씀.

        System.out.println(x+" 더하기 "+y+"는 "+result+"입니다.");
        //가독성을 위해 문자열에서 공백을 알맞게 추가


        x = 4; // overwrite
        y = 8;
        result = x*y;

        System.out.println(2+" 곱하기 "+y+"는 "+result+"입니다.");

    }
}
