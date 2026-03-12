package ch06_abstract_interface.cafeinterface;

public abstract class Beverage05 {

    // 카페 이름은 객체 생성하지 않아도 접근이 가능하도록 하는 것이 좋겠습니다. (static을 사용하면 객체 없이 사용가능)
    // final이 붙어 있으면 편집 불가능한 상수(constant)입니다.
    public static final String STORE_NAME = "G-CAFE";

    private static int beverageCount = 0; // 주문한 커피 잔수



    public static int getBeverageCount(){
        return beverageCount;
    }

    private String name;
    private double price;

    // 모든 음료는 마십니다.
    public abstract void drink();

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String imsi = "이름 : " + name + ", 가격 : " + price;
        return imsi;
    }

    public Beverage05(){
    }

    public Beverage05(String name, double price) {
        this.name = name;
        this.price = price;
        beverageCount++;
    }
}
