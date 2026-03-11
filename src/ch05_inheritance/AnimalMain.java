package ch05_inheritance;

public class AnimalMain {
    static void main() {
        // 클래스이름 객체이름 = new 생성자이름();
        Dog retriver = new Dog(); //챱츄
        retriver.name="김챱츄챱챱츄";
        retriver.age=2;
        retriver.guide=false;
        retriver.display();
        retriver.feed="건식 사료";
        retriver.eat();
        retriver.bark();

        System.out.println("객체 정보");
        System.out.println(retriver.toString());


        Dog maltese = new Dog();
        maltese.name="이말티즈";
        retriver.feed="습식 사료";
        maltese.age=7;
        maltese.guide=true;
        maltese.display();
        maltese.bark();


        //고양이 : 페르시안(persian), 샴(siamese)
        Cat persian = new Cat();
        persian.name="권페르시안";
        persian.age=5;
        persian.indoor=true;
        persian.display();
        persian.bark();


        Cat siamese = new Cat();
        siamese.name="샴샴이";
        siamese.age=9;
        siamese.indoor=false;
        siamese.display();
        siamese.bark();

        Cat hjin = new Cat();
        hjin.name="권혜진";
        hjin.age=24;
        hjin.indoor=false;
        hjin.display();
        // hjin.bark();
        System.out.println("권혜진이(가) 꿀꿀 하고 울면서 밥을 먹고 먹고 또 먹고 배터져 사망하는 사실이 아침 9시 뉴스에 밝혀지면서 대한민국의 미래가 어두워지고 말았습니다.");
    }
}
