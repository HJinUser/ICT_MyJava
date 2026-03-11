package ch05_inheritance.myvbeverage;

public class Americano04 extends Beverage04 {
    private double waterAmount; //투입하는 물의 양

    @Override
    public String toString() {
        String imsi = ", 물의 양 : "+waterAmount;
        return super.toString() + imsi;
    }

    public Americano04 (String name, double price, double waterAmount){
        super(name, price); //생성자를 통하여 데이터를 수퍼 클래스에 넘겨줍니다.
        this.waterAmount=waterAmount;
    }

    public void printInfo(){
        super.showInfo();
        System.out.println("투입된 물의 량 : "+waterAmount +"ml");
        System.out.println();
    }

    //홀짝홀짝 마시다
    public void sipAmericano(){
        String message = super.getName()+ "를 홀짝 홀짝 마십니다.";
        System.out.println(message);
    }

}
