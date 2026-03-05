package ch02_control_statement;

public class If05 {
    static void main() {
        int su = 4;
        if (su % 7 == 0) {
            System.out.println(su * su);
        } else {
            System.out.println(su + 3);
        }
    }
}
