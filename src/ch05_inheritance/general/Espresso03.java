package ch05_inheritance.general;

public class Espresso03 extends Beverage03 {
    private int shotCount; //샷 추가 갯수

    public Espresso03 (String name, double price, int shotCount){
        super(name, price); //생성자를 통하여 데이터를 수퍼 클래스에 넘겨줍니다.
        this.shotCount=shotCount;
    }

    public void printInfo() {
        super.showInfo();
        System.out.printf("샷 추가 : %d개\n\n",shotCount);
    }
}
