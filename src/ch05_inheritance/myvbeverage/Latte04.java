package ch05_inheritance.myvbeverage;

public class Latte04 extends Beverage04 {
    private String milkType; //우유의 타입

    public Latte04 (String name, double price, String milkType){
        super(name, price); //생성자를 통하여 데이터를 수퍼 클래스에 넘겨줍니다.
        this.milkType=milkType;
    }

    public void printInfo() {
        super.showInfo();
        System.out.println("우유 종류 : "+milkType);
    }

    public void enjoyLatte(){
        String message = "부드럽고 크리미한 %s를 마십니다.\n";
        System.out.printf(message, super.getName());
    }

}
