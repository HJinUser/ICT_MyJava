package ch05_inheritance.myvbeverage;

public class Espresso04 extends Beverage04 {
    private int shotCount; //샷 추가 갯수

    public Espresso04 (String name, double price, int shotCount){
        super(name, price); //생성자를 통하여 데이터를 수퍼 클래스에 넘겨줍니다.
        this.shotCount=shotCount;
    }

    public void printInfo() {
        super.showInfo();
        System.out.printf("샷 추가 : %d개\n\n",shotCount);
    }

    public void drinkEspresso(){
        String message = "투입할 샷의 개수는 "+shotCount + "개 입니다.";
        System.out.println(message);
    }

}
