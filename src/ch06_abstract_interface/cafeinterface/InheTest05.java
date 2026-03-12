package ch06_abstract_interface.cafeinterface;

public class InheTest05 {
    static void main(String[] args) {
        // Beverage05.STORE_NAME = "하하하";
        System.out.println("어서 오세요~~" + Beverage05.STORE_NAME + "입니다.");

        // 부모 타입을 사용한 배열 생성
        Beverage05[] orderList = {
                new Americano05("아메리카노", 4000.0, 200),
                new Espresso05("에스프레소", 3000.0, 1),
                new Latte05("카페라떼", 4500.0, "바나나 우유"),
                new Cappuccino05("카푸치노", 5000, "우유", 50),
                new SpecialCoffee05("스페셜커피", 6000.0, 150, 2, "우유")
        };

        System.out.println("주문 잔수 : " + Beverage05.getBeverageCount());

        // 이것도 승급(UpCasting)임
        // 클래스명 객체명 = new연산자 생성자();
        // 타입[] 배열명 = {배열요소};
        // println(타입[]); = 배열요소 // 이거 자체가 사실상 변수라고 봐도 됨
        // 따라서 사실상 타입[] 자체가 객체임

        System.out.println("향상 for를 사용한 출력");
        for (Beverage05 item : orderList) {
            System.out.println("--------------------------------------");
            System.out.println(item);

            if (item instanceof Americano05) {
                ((Americano05) item).adjustWater(20); // 강등(DownCasting)

            } else if (item instanceof Espresso05) {
                ((Espresso05) item).addShot(1); // 강등(DownCasting)

            } else if (item instanceof Latte05) {
                ((Latte05) item).changeMilk("아몬드 우유"); // 강등(DownCasting)

            } else if (item instanceof SpecialCoffee05) {
                ((SpecialCoffee05) item).addShot(1);
                ((SpecialCoffee05) item).adjustWater(50);
                ((SpecialCoffee05) item).changeMilk("아몬드 우유");

            } else if (item instanceof Cappuccino05){
                ((Cappuccino05)item).changeMilk("초코 우유");
                ((Cappuccino05)item).addFoam(50);

            }

            item.drink();
            System.out.println();
        }
    }
}