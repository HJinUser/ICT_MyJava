package ch02_control_statement;

public class While01 {
    static void main(String[] args) {
        int total = 0;

        int i = 1;
        while (i < 11) {
            i++;
            total +=i;
        }

        System.out.println("총합01: "+total);

        //1부터 100까지 더하기. 단 3씩 증가
        //1+4+7...+100
        i=1;
        total = 0;
        while(i<101){
            total +=i;
            i +=3;
        }

        System.out.println("총합02: "+total);

        // 97 + 92 + 87 + ... +2 = ??
        i=97;
        total =0;
        while (i>0){
            total +=i;
            i -=5;
        }
        System.out.println("총합03: "+total);

        // 1*1 + 6*6 + 11*11 + ... + 96*96 = ??
        i=1;
        total=0;
        while (i<100){
            total +=i*i;
            i+=5;
        }
        System.out.println("총합04: "+total);

    }
}
