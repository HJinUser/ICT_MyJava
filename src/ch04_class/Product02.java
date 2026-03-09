package ch04_class;

public class Product02 {
    static String brand; //브랜드(스택틱 변수 = 클래스 변수)

    // 멤버 변수는 타입별로 기본 값이 있습니다.
    // 정수(0), 실수(0.0)
    private String name; //상품명
    private int price; //단가
    String inputdate; //입고 일자

    public void setPrice(int _price) {
        price = _price;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String _name) {
        name = _name;
    }

    public String getName() {
        return name;
    }
}
