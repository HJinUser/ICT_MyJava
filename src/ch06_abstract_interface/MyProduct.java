package ch06_abstract_interface;
import ch04_class.Product01;

public class MyProduct {
    static void main(String[] args) {
        Product01 apple = new Product01();

        apple.name="사과";

        System.out.println("품목 이름 : "+apple.name);
    }
}
