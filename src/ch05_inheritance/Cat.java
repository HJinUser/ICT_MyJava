package ch05_inheritance;

public class Cat extends Animal {
    boolean indoor; //애완묘, 길고양이

    @Override //이 메소드는 오버라이딩 되었습니다.
    public void display() {

        // super는 나의 슈퍼 클래스 Animal을 의미합니다.
        super.display();
        if(indoor){
            System.out.println("애완묘");
        }
        else{
            System.out.println("길고양이");
        }

    }

    public void bark(){
        System.out.println(super.name+"이(가) 냐아~ 하고 웁니다");
    }
}
