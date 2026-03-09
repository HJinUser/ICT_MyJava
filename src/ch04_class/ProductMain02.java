package ch04_class;

public class ProductMain02 {
    static void main() {
        Product02.brand = "농심"; //객체 선언 안햇는데도 작동이 됨.


        Product02 shin = new Product02();

        Product02 blackbeen = new Product02();

        shin.setName("신상품 블랙 신라면!");
        shin.setPrice(1000); //간접쓰기
        shin.inputdate="2026/03/01"; //직접쓰기

        System.out.println(Product02.brand);

        shin.brand = "NongSim";

        System.out.println(Product02.brand);

        System.out.println(shin.getPrice());
        System.out.println(shin.getName());

        for (int i = 0; i < 10; i++) {

        }
        for (int i = 0; i < 20; i++) {

        }
    }
}
