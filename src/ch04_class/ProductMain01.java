package ch04_class;

public class ProductMain01 {
    static int add(int x, int y){
        return x+y;
    }
    static void main() {
        //단계02 : 객체 생성
        // '생성자 이름'은 '클래스 이름'과 동일해야 합니다.
        // 클래스이름 객체이름 = new 생성자이름();
        Product01 shin = new Product01();

        Product01 blackbeen;
        blackbeen = new Product01(); //위와 동일한 방식임.

        //단계03 : 멤버 변수에 값을 할당하기.
        //.을 멤버 참조 연산자 라고 부른다.
        shin.name="신라면";
        shin.price =1000;
        shin.inputdate="2026/03/01";

        //단계04 : 멤버 변수들의 값을 출력
        System.out.println("1번 상품 정보 출력");
        System.out.println("이름 : "+shin.name);
        System.out.println("단가 : "+shin.price);
        System.out.println("입고 일자 : "+shin.inputdate);

        //짜파게티도 설정해보아요
        blackbeen.name = "짜파게티";
        blackbeen.price=2000;
        blackbeen.inputdate="2026/03/09";

        //2번 상풍 출력
        System.out.println("2번 상품 정보 출력");
        System.out.println("이름 : "+blackbeen.name);
        System.out.println("단가 : "+blackbeen.price);
        System.out.println("입고 일자 : "+blackbeen.inputdate);

        int su=3;
        int result = shin.plus5(su); //메소드 호출
        System.out.println("결과 : "+result );
        System.out.println();
        System.out.println(shin.showData());
        shin.Display();
    }
}
