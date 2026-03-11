package ch05_inheritance.general;

public class Americano03 extends Beverage03 {
    private double waterAmount; //투입하는 물의 양

    public Americano03 (String name, double price, double waterAmount){
        super(name, price); //생성자를 통하여 데이터를 수퍼 클래스에 넘겨줍니다.
        this.waterAmount=waterAmount;
    }

    public void printInfo(){
        super.showInfo();
        System.out.println("투입된 물의 량 : "+waterAmount +"ml");
        System.out.println();
    }

}
