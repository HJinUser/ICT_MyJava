package ch05_inheritance.general;

/*
1. private은 getter/setter로 접근
2. private 대신 protected로 작성
3. 생성자를 통한 대입 <-우린 이 방법 사용
 */

public class Beverage03 {
    private String name; //음료 이름
    private double price; //단가

    public Beverage03(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Beverage03(){}

    public void showInfo(){
        System.out.println("음료 이름 : "+name);
        System.out.println("단가 : "+price+"원");
    }

}
