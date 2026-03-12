package ch06_abstract_interface.cafeinterface;

public interface MilkAddable {
    // 우유의 타입을 변경하는 추상 메소드
    // 고객이 타입을 바꿔달라고 요청하는 경우
    public abstract void changeMilk(String milkType);
}
