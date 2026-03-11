package ch05_inheritance.general;

public class Latte03 extends Beverage03 {
    private String milkType; //우유의 타입

    public Latte03 (String name, double price, String milkType){
        super(name, price); //생성자를 통하여 데이터를 수퍼 클래스에 넘겨줍니다.
        this.milkType=milkType;
    }

    public void printInfo() {
        super.showInfo();
        System.out.println("우유 종류 : "+milkType);
        System.out.println();
    }
}
