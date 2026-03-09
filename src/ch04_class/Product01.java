package ch04_class;

public class Product01 { //단계01 : 클래스 정의
    //멤버변수
    String name; //상품명
    int price; //단가
    String inputdate; //입고 일자

    //정수 1개를 입력 받아서 +5를 수행하고, 값을 반환합니다.
    //반환타입 메소드이름(매개변수리스트){...}
    int plus5(int x) {
        return x + 5;
    }

    //상품명 : 신라면, 단가 : 1000원, 입고 : 2026/03/01
    String showData() {
        String result = "상품명 : " + name + ", 단가 : " + price + ", 입고 : " + inputdate;
        return result;
    }

    void Display() {
        System.out.println("이름 : " + name);
        System.out.println("단가 : " + price);
        System.out.println("입고날짜 : " + inputdate);
    }

}
//기존에 있던 여러가지 자료형들을 내가 모아서 새로운 자료형.
//이 자료형을 사용하기 위해서는 Product를 사용하면 된다.