package ch06_abstract_interface.cafeinterface;

// Beverage05와 MilkAddable 상속 받기
public class Cappuccino05 extends Beverage05 implements MilkAddable, FoamAddable {
    private String milkType;
    private double foamAmount; // 거품량

    @Override
    public void drink() {
        System.out.println("거품의 양이 " + foamAmount + "인 " + super.getName() + "를 젠틀하게 먹습니다.");
    }

    @Override
    public void changeMilk(String milkType) {
        System.out.println("우유의 타입이 " + this.milkType + "에서 " + milkType + "으로 변경되었습니다.");
        this.milkType = milkType;
    }

    @Override
    public void addFoam(double amount){
        this.foamAmount += amount;
        System.out.println("거품량 추가 : " + amount);
        System.out.println("현재 거품의 양 : " + this.foamAmount);
    }


    public Cappuccino05(String name, double price, String milkType, double foamAmount){
        super(name, price);
        this.milkType = milkType;
        this.foamAmount = foamAmount;
    }



}
