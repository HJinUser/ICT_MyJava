package lineage;

import java.util.Scanner;

public class LineageFunc {


    //action 선택
    public static int choiceAction(Character chat1, Character chat2, Scanner s) throws InterruptedException {
        System.out.print("동작 선택 1.기본공격, 2.스킬, 3.조롱, 4.도망, 5.포션사용, 6.게임종료 ====> ");
        int action = s.nextInt();
        Thread.sleep(1000);
        switch (action){
            case 1:                                                     //공격
                chat1.attack(chat2);
                break;
            case 2:
                Action act1 = (Action)chat1;                            //스킬사용
                act1.skill(chat2);
                break;
            case 3:
                Action act2 = (Action)chat1;                            //조롱
                act2.mockery(chat2);
                break;
            case 4:
                Action act3 = (Action)chat1;                            //도망
                act3.run();
                break;
            case 5:
                chat1.usingPotion();                                    //물약사용
                break;
            case 6:
                getOut();                                               //게임종료
        }

        //체력 0이하면 게임종료
        return chat1.getStamina() < 1 ? result(chat1, chat2) : chat2.getStamina() < 1 ?  result(chat2, chat1) : -1;
    }

    public static int result(Character c1, Character c2){
        System.out.println(c1.getCharacterName() + " (이)가 사망. \n결과 :"+c2.getCharacterName()+" (이)가 승리.");
        return 1;
    }

    public static void getOut(){
        System.out.println("시스템을 종료합니다.");
        System.exit(0);
    }
}
