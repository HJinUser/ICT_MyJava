package ch06_abstract_interface.cafeinterface;

public class Espresso05 extends Beverage05 implements ShotAddable{
    private int shotCount;

    @Override
    public void addShot(int count){
        this.shotCount += count;
        System.out.println("샷 추가 : " + count + "샷");
        System.out.println("현재 샷 추가 : " + this.shotCount + "샷");
    }

    @Override
    public void drink(){
        System.out.println("샷 개수 " + shotCount + "인 " + super.getName() + "를 진하게 한모금 마십니다.");
    }

    public Espresso05(String name, double price, int shotCount ){
        super(name, price);
        this.shotCount = shotCount;
    }

    @Override
    public String toString() {
        return super.toString() + ", 샷 추가 갯수 : " + shotCount;
    }
}
