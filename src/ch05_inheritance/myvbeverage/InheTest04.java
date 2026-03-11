package ch05_inheritance.myvbeverage;

public class InheTest04 {
    static void main(String[] args) {
        // 승급 (업캐스팅) : 낮은 등급의 클래스가 높은 등급의 클래스 타입으로 한시적 형태가 바뀌는 동작
        Beverage04 beverage01 = new Americano04("아메리카노", 4000.0, 200.0);
        //슈퍼 클래스내 들어있는 메소드는 상속 개념에 의하여 접근이 가능합니다.
        beverage01.showInfo();
        Americano04 coffee = (Americano04) beverage01; //강등
        coffee.sipAmericano(); //아메리카노를 마시는 방법


        Beverage04 beverage02 = new Espresso04("에스프레소", 5000.0, 2);
        beverage02.showInfo();
        Espresso04 coffee02 = (Espresso04) beverage02;
        coffee02.drinkEspresso(); //에스프레소를 마시는 방법


        Beverage04 beverage03 = new Latte04("라떼", 4300.0, "딸기우유");
        beverage03.showInfo();
        Latte04 coffee03 = (Latte04) beverage03;
        coffee03.printInfo();
        coffee03.enjoyLatte(); //라떼를 마시는 방법

        //승급 개념과 배열의 사용
        Beverage04[] beverage = {
                beverage01,
                new Espresso04("마이뿌레소", 3600.0, 3),
                new Latte04("바나나 라떼", 6000.0, "바나나 우유")
        };

        System.out.println("------------------------");
        for (int i = 0; i < beverage.length; i++) {
            System.out.println("--------------------------------------------------------");
            beverage[i].showInfo();

            // instanceof :승급된 객체 변수가 수많은 서브 클래스 중에서 어떤 클래스로
            //             생성이 되었는 지를 판단하고자 할 때 사용합니다.
            if (beverage[i] instanceof Americano04) { // 아메리카노
                Americano04 ameri = (Americano04) beverage[i]; //강등
                ameri.sipAmericano();
            } else if (beverage[i] instanceof Espresso04) { //에스프레소
                Espresso04 espre = (Espresso04) beverage[i]; //강등
                espre.drinkEspresso();

            } else if (beverage[i] instanceof Latte04) { //라떼
                Latte04 latte = (Latte04) beverage[i]; //강등
                latte.enjoyLatte();

            } else { // 차후에...

            }
            //객체를 프린트하면 암시적으로 toString() 메소드가 호출이 됩니다.
            System.out.println(beverage[i]); //객체를 출력하라고 하면 암시적으로 toString을 호출하라는 소리랑 같음.

        }

    }
}