package ch04_class;

public class LOLMain {
    public static void main() {
        LOL Lulu = new LOL();
        Lulu.setName("룰루"); //이름 Lulu
        Lulu.setHeal(1000); //체력 1000
        Lulu.setAd(45); //기본 공격력 45
        Lulu.setDef(25); //기본 방어력 25

        LOL Yumi = new LOL();
        Yumi.setName("유미"); //이름 Yumi
        Yumi.setHeal(800); //체력 800
        Yumi.setAd(60); //기본 공격력 60
        Yumi.setDef(10); //기본 방어력 10

        // 아이템 이름, 가격, 공증가, 체증가, 방증가
        //루덴의 메아리, 공허의 지팡이, 가고일의 돌갑옷
        LOLItem luden = new LOLItem();
        luden.setItem_name("루덴의 메아리");
        luden.setItem_price(3200);
        luden.setAd_up(80);
        luden.setHp_up(0);
        luden.setDef_up(0);

        LOLItem voidStaff = new LOLItem();
        voidStaff.setItem_name("공허의 지팡이");
        voidStaff.setItem_price(3000);
        voidStaff.setAd_up(60);
        voidStaff.setHp_up(0);
        voidStaff.setDef_up(0);

        LOLItem gargoyle = new LOLItem();
        gargoyle.setItem_name("가고일의 돌갑옷");
        gargoyle.setItem_price(3200);
        gargoyle.setAd_up(0);
        gargoyle.setHp_up(200);
        gargoyle.setDef_up(60);

        int count = 0;
        while (true) {
            Lulu.Nomal_Atack(Yumi);
            Yumi.Nomal_Atack(Lulu);
            Lulu.Cri_Atack(Yumi);
            Yumi.Cri_Atack(Lulu);
            count++;
            if (Lulu.getHeal() <= 0 && Yumi.getHeal() <= 0) {
                System.out.println("둘다 죽어버려서 승자는 권혜진이네용~");
                System.out.println(count * 2 + "번 싸웠습니다.");
                break;
            }
            if (Lulu.getHeal() <= 0) {
                System.out.println("유미 승리!");
                System.out.println(count * 2 + "번 싸웠습니다.");
                break;
            }
            if (Yumi.getHeal() <= 0) {
                System.out.println("귀요미 룰루 승리!");
                System.out.println(count * 2 + "번 싸웠습니다.");
                break;
            }
        }
    }
}
