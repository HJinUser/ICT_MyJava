package ch02_control_statement;

public class PrintStar {
    static void main(String[] args) {
        int star =12;
        for(int i =0;i<star; i++ ){
            System.out.print("*");
            if(i%5==0){
                System.out.println();
            }
        }
    }
}
