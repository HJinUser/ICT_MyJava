package ch02_control_statement;

public class SumOneToN {
    static void main(String[] args) {
        int n=10;
        int total=0;
        for (int i =1; i<=n; i++){
            total+=i;
        }
        System.out.printf("1부터 %d까지의 총합은 %d입니다.",n,total);
    }
}
