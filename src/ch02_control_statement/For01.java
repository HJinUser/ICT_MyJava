package ch02_control_statement;

public class For01 {
    static void main(String[] args) {
        //1부터 10까지의 총합
        int total = 0;

        for (int i = 1; i <11; i++) {
            total +=i;
        }

        System.out.println("총합01 : "+total);

        //1부터 100까지 더하는 문장 만들기
        //i는 3씩 증가
        total = 0;
        for (int i =1; i<=100; i+=3){
            total +=i;
        }
        System.out.println("총합02: "+total);


        //97부터 5씩 줄여가며 i가 0보다 작을때까지 반복하기
        total = 0;
        for(int i =97; i>0; i-=5){
            total +=i;
        }
        System.out.println("총합03: "+total);


        //1*1 + 6*6 + 11*11 .. 96*96= total
        total = 0;
        for(int i =1; i<97;i+=5){
            total +=i*i;
        }
        System.out.println("총합04: "+total);
    }
}
