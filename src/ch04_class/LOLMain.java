package ch04_class;

public class LOLMain {
    public static void main() {
        LOL[] characters = new LOL[2];
        //이름 룰루, 체력 1000, 공격력 45, 방어력 25
        characters[0] = new LOL("룰루", 1000, 45, 25);
        //이름 유미, 체력 800, 공격력 60, 방어력 10
        characters[1] = new LOL("유미", 800, 60, 10);

        // 아이템 이름, 가격, 공증가, 체증가, 방증가
        //루덴의 메아리, 공허의 지팡이, 가고일의 돌갑옷
        LOLItem[] items = {
                new LOLItem("루덴의 메아리", 3200, 0, 80, 0),
                new LOLItem("공허의 지팡이", 3000, 100, 70, 0),
                new LOLItem("가고일의 돌갑옷", 3200, 400, 0, 60)
        };

        int count = 0;
        int lulu_count = 0;
        int yumi_count = 0;
        int i = 0;
        while (true) {
            characters[0].Nomal_Atack(characters[1]);
            characters[1].Nomal_Atack(characters[0]);
            characters[0].Cri_Atack(characters[1]);
            characters[1].Cri_Atack(characters[0]);
            count++;
            if (characters[0].getHeal() < 400 && characters[0].getHeal() > 200 && lulu_count == 0) {
                System.out.printf("위기에 몰린 %s가 %s를 구매했습니다!\n", characters[0].getName(), items[0].getItem_name());
                characters[0].buy_item(items[0]);
                lulu_count++;
            }
            if (characters[1].getHeal() < 400 && characters[1].getHeal() > 200 && yumi_count == 0) {
                System.out.printf("위기에 몰린 %s가 %s를 구매했습니다!\n", characters[1].getName(), items[1].getItem_name());
                characters[1].buy_item(items[0]);
                yumi_count++;
            }
            if (characters[0].getHeal() < 200 && characters[0].getHeal() >0 && lulu_count == 1) {
                System.out.printf("위기에 몰린 %s가 %s를 구매했습니다!\n", characters[0].getName(), items[2].getItem_name());
                characters[0].buy_item(items[2]);
                lulu_count++;
            }
            if (characters[1].getHeal() < 200 && characters[1].getHeal() >0 && yumi_count == 1) {
                System.out.printf("위기에 몰린 %s가 %s를 구매했습니다!\n", characters[1].getName(), items[2].getItem_name());
                characters[1].buy_item(items[2]);
                yumi_count++;
            }
            if (characters[0].getHeal() <= 0 && characters[1].getHeal() <= 0) {
                System.out.println("둘다 죽어버려서 승자는 권혜진이네용~");
                System.out.println(count * 2 + "번 싸웠습니다.");
                break;
            }
            if (characters[0].getHeal() <= 0) {
                System.out.println("유미 승리!");
                System.out.println(count * 2 + "번 싸웠습니다.");
                break;
            }
            if (characters[1].getHeal() <= 0) {
                System.out.println("귀요미 룰루 승리!");
                System.out.println(count * 2 + "번 싸웠습니다.");
                break;
            }
        }
    }
}
