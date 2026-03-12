package ch03_array;

import java.security.AlgorithmConstraints;

public class Array01 {
    static void main(String[] args) {
        String[] bts = new String[7];
        bts[0] = "진";
        bts[1] = "뷔";
        bts[2] = "정국";
        bts[3] = "RM";
        bts[4] = "지민";
        bts[5] = "슈가";
        bts[6] = "제이홉";

        for(String n : bts){
            System.out.println(n);
        }
    }
}
