package ch02_control_statement;

public class JUNIE {
    static void main(String[] args) {
        //이중반복문을 사용해 피라미드 만들기 세모로
        //빈칸 출력j *i
        //i가 0일때 공백 3개 별하나 공백 3개
        //i가 1일때 공백 2개 별3개 공백 2개
        //i가 2일때 공백 1개 별5개 공백 1개
        //i가 3일때 공백 0개 별7개 공백 0개
        for (int i = 0; i < 4; i++) {
            for (int j = 3; j - i >= 0; j--) { //i=0 j=3 3-1=2 2-1=1 1-1=0
                System.out.printf(" ");
            }
            //i가 0일때 j가 1
            //i가 1일때 j범위가 3까지 0 1 2 4
            //i가 2일때 j범위가 5까지
            //i가 3일때 j범위가 7까지 i*2 +1 해주기

            /*여기가 내가 한거..
            for (int j = 0; i >= j; j++) {//i가 커지면 같이 커져야지
                System.out.printf("*");
            }
            for (int k = 1; i >= k; k++) {//i가 커지면 같이 커져야지
                System.out.printf("*");
            }*/
            for(int j = 0; j<i*2+1;j++){
                System.out.printf("*");
            }
            System.out.println();

        }
    }
}
