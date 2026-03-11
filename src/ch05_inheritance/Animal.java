package ch05_inheritance;

public class Animal {
    String name;
    int age;
    String feed; //먹이

    @Override
    public String toString() {
        //메소드 은닉화 : 오버라이딩시 본의 아니게 부모 메소드 접근이 막히는 현상
        String imsi = "이름 : "+name+", 나이 : "+age+ ", 먹이 : "+feed;
        return imsi;
    }

    public void display(){
        System.out.println();
        System.out.println("이름 : "+name);
        System.out.println("나이 : "+age+"살");
    }
    //eat(), bark()
    public void eat(){ //뭘 먹는지 쓰기위해 사료같은거 추가하자!
        System.out.println(name + "이(가) "+feed+"를 먹습니다.");
    }
    public void bark() {
        System.out.println(name+"이(가) 짖습니다.");
    }

}
