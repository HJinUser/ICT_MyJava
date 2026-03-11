package ch04_class;

public class ProductMain03 {
    static void main() {
        //객체 선언 방법
        //클래스이름 객체이름 = new 생성자이름 ;
        Product03 shin = new Product03("신라면", 1000, "2026/03/01");
        shin.display();

        Product03 blackbeen = new Product03("짜파게티", "2026/03/10");
        blackbeen.display();

        Product03 banana = new Product03();
        banana.display();

        int size=2;
        System.out.println("상품"+size+"개를 배열로 다뤄봅시다.");

        int[] arr = new int[3];

        //배열 정의
        Product03[] itemlist = new Product03[size];

        //0번째 객체 생성
        itemlist[0] = new Product03("소이조이",2000,"2025/08/15");
        itemlist[1] = new Product03("맥심커피","2025/07/17");

        for (int i = 0; i < itemlist.length ; i++) {
            System.out.println((i+1)+"번째 상품 정보");
            itemlist[i].display();
            System.out.println();
        }

        Product03[] productArray={
                new Product03("쭈쭈바",1500,"2025/012/25"),
                new Product03("사과",3000,"2025/06/06"),
                new Product03("오징어땅콩","2025/07/17")
        };

        for (int i = 0; i < productArray.length ; i++) {
            System.out.println((i+1)+"번째 상품 정보");
            productArray[i].display();
            System.out.println();
        }
    }
}
