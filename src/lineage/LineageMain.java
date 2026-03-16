package lineage;

import java.util.Scanner;

public class LineageMain {
    static void main(String[] args) throws InterruptedException {

        //캐릭터 생성
        Character[] characters = {
                new Musketeer("남", "총사", 60, 10, 400, 100),
                new Wizard("여", "마법사", 50, 11, 500, 100),
                new Cleric("남", "나이팅게일", 57, 13, 500, 100),
                new Burglar("남", "도둑놈", 54, 9, 470, 100),
                new Warrior("남", "헬스남", 60, 12, 600, 100),
        };

        //캐릭터 선택받기
        Scanner s = new Scanner(System.in);
        System.out.print("첫번째 캐릭터를 선택해주세요(1.총사, 2.마법사, 3.힐러, 4.도둑, 5.전사) ====> ");
        int cho1 = s.nextInt()-1;
        System.out.print("두번째 캐릭터를 선택해주세요(1.총사, 2.마법사, 3.힐러, 4.도둑, 5.전사) ====> ");
        int cho2 = s.nextInt()-1;

        System.out.println("캐릭터 선택중입니다.");
        Character choiceOne =  characters[cho1];
        Character choiceTwo =  characters[cho2];
        Thread.sleep(1000);
        System.out.println("---------------------------------------------");
        System.out.println();
        choiceOne.appearedPrintInfo();
        System.out.println();
        choiceTwo.appearedPrintInfo();
        System.out.println();

        //Action
        while(true){
            System.out.println("---------------------------------------------");
            if(LineageFunc.choiceAction(choiceOne, choiceTwo, s) > -1 ) break;                //선택1캐릭 Action
            System.out.println("---------------------------------------------");
            if(LineageFunc.choiceAction(choiceTwo, choiceOne, s) > -1 ) break;                //선택2캐릭 Action
            System.out.println("---------------------------------------------");
        }
    }
}
