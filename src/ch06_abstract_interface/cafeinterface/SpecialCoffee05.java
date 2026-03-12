package ch06_abstract_interface.cafeinterface;

public class SpecialCoffee05 extends Beverage05 implements WaterAdjustable, ShotAddable, MilkAddable {

    private double waterAmount;
    private int shotCount;
    private String milkType;

    public SpecialCoffee05(String name, double price, double waterAmount, int shotCount, String milkType) {
        super(name, price);
        this.waterAmount = waterAmount;
        this.shotCount = shotCount;
        this.milkType = milkType;
    }

    @Override
    public void drink(){
        System.out.println(super.getName() + "을(를) 마십니다.");
    }

    @Override
    public void changeMilk(String milkType){
        System.out.println("타입 변경 이전 : " + this.milkType + ", 이후 : " + milkType);
        this.milkType = milkType;
    }

    @Override
    public void addShot(int count){
        this.shotCount += count;
        System.out.println("샷이 " + count + "개 추가되어 " + shotCount + "개입니다.");
    }

    @Override
    public void adjustWater(double amount){
        this.waterAmount += amount;
        System.out.println("물 " + amount + "ml를 추가하였습니다.");
    }
}
