package ch01_variable_operator;

public class PrintMe {
    static void main() {
        //이름 나이 키 몸무게 혈액형 유형(자체 a,b,c 타입이 있다고 가정) 진위
        // 변수 정의
        String name, blood;
        int age;
        double height, weight;
        char type;
        boolean bool;

        //변수에 값 할당
        name = "권혜진";
        age = 24;
        height = 160.0;
        weight = 60.0;
        blood = "O";
        type = 'A';
        bool = true;

        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("키 : " + height);
        System.out.println("몸무게 : " + weight);
        System.out.println("혈액형 : " + blood);
        System.out.println("유형 : " + type);
        System.out.println("진위 : " + bool);

    }
}
