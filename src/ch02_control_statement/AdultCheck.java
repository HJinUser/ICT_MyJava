package ch02_control_statement;

public class AdultCheck {
    static void main() {
        String name = "권혜진";
        int age = 12;
        int _gender = 3; //임시변수

        String gender; //성별
        String adult;

        if(_gender==1 || _gender==3){ //남자이면
            gender = "남자";
        }else{
            gender = "여자";
        }

        if(age>=19){
            adult="성인";
        }
        else{
            adult="미성년자";
        }

        //println 메소드 : 문자열을 출력하고, 엔터키를 누르는 역학을 합니다.
        //메소드 = 역할 = 기능 = 함수
        System.out.println("이름 : "+name+", 나이 : "+age);

        //서식 지정자 : %s(문자열) %d(정수)
        // printf 메소드 : 서식 지정자를 이용한 출력, 엔터키 기능 없음.
        System.out.printf("이름 : %s, 나이 : %d, 성별 : %s, 성인 여부 : %s", name, age, gender, adult);
//        System.out.println("하하하");

    }
}
