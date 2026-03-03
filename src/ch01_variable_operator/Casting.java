package ch01_variable_operator;

public class Casting {
    static void main() {
        double d =100; //암시적 형변환
        System.out.println("d : "+d);

        int i = (int)3.14; //(형변환연산자)3.14
        System.out.println("i : "+i);

        System.out.println(14/5); //2

        //2.8이 나오게 하는 방법
        System.out.println(14.0/5);

        System.out.println((double)14/5); //casting
        System.out.println((double)(14/5)); //14/5를 괄호로 묶음.


        int kor =50, eng =60, math=80;
        int total=kor + eng + math;
        System.out.println("총점 : "+total);

        double average = (double)total/3;

        System.out.println("평균 : "+average);

        char ch1='c';
        char ch2='a';
        boolean bool1 = ch1 > ch2 ; //각각 99와 97로 암시적 형변환
        System.out.println("bool1 : "+bool1);

        int result = ch1 - ch2 + 5;
        System.out.println("result : "+result);

        char ch3='c';
        String str = ch3<='Z' && ch3>='A' ? "대문자":"소문자";
        System.out.println("str : "+str);

    }
}

