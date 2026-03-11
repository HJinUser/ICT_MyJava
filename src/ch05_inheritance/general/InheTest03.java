package ch05_inheritance.general;

public class InheTest03 {
    static void main(String[] args) {
        Americano03 americano = new Americano03("아메리카노", 4000.0, 200.0);
        Espresso03 espresso = new Espresso03("에스프레소",5000.0,2);
        Latte03 latte = new Latte03("라떼",6000.0,"아몬드우유");

        americano.printInfo();
        espresso.printInfo();
        latte.printInfo();


    }
}
