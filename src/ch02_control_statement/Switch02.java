package ch02_control_statement;

public class Switch02 {
    static void main() {
        int month =3;
        switch (month){
            case 12 : case 1: case 2:
                System.out.println("겨울입니다.");
                break;
            case 3: case 4: case 5:
                System.out.println("봄입니다.");
                break;
            case 6: case 7: case 8:
                System.out.println("여름입니다");
                break;
            default:
                System.out.println("가을입니다.");
        }
    }
}
