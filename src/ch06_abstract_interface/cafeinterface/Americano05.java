package ch06_abstract_interface.cafeinterface;

public class Americano05 extends Beverage05 implements WaterAdjustable{
    private double waterAmount;

    @Override
    public void adjustWater(double amount) {
        this.waterAmount += amount;
        System.out.println("물 추가 : " + amount + "ml");
        System.out.println("현재 물의 양 : " + this.waterAmount);
    }

    @Override
    public void drink() {
        System.out.println("물의 양이 " + waterAmount + "ml인 " + super.getName() + "를 뜨거운 물과 함께 마십니다.");
    }

    @Override
    public String toString() {
        return super.toString() + ", 물의 양 : " + waterAmount;
    }

    public Americano05(String name, double price, double waterAmount) {
        super(name, price);
        this.waterAmount = waterAmount;
    }

}
