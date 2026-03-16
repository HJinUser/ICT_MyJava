package lineage;

public class Cleric extends Character implements Action {
    int mp_potion = 3;

    public Cleric(String gender, String characterName, double attackPower, double defense, double stamina, double MP) {
        super(gender, characterName, attackPower, defense, stamina, MP);
    }

    @Override
    public void attack(Character o) {
       o.setStamina(o.getStamina()-(getAttackPower() - o.getDefense()/2));
    }

    @Override
    public void usingPotion() {
        if (mp_potion == 0) {
            System.out.println("현재 보유하고 있는 포션이 없습니다");
            return;
        }

        System.out.println(super.getCharacterName() + "님이 체력회복 포션을 먹었습니다.");
        setStamina(getStamina() + 10);
        System.out.println("현재 체력 : "+getStamina());
        mp_potion--;
    }

    @Override
    public void skill(Character c) {
        System.out.println("스킬이 발동됩니다.");
        //현재 소지한 마나가 필요 마나보다 부족할 때 참으로 리턴하기
        if(getMP()<=40){ //현재 마나 비교
            System.out.println("소지한 마나가 부족합니다. (현재마나 : "+getMP()+")");
            return;
        }
        String originalSkill = "힐";
        System.out.print("스킬 "+ originalSkill +"을 사용했습니다.");
        //현재 체력에서 감소된 체력 보여주기
        //현재 체력 : 캐릭.get체력
        System.out.println("체력이 20회복 되었습니다.");
        setStamina(getStamina()+20);
        System.out.println("현재 체력 : "+getStamina());
        //감소된 체력 : 현재체력 - 1.8*(공격력 - 방어력/2)
        System.out.println("상대의 체력을 깎습니다.");
        System.out.printf("%s 체력 : %.1f -> %.1f \n",c.getCharacterName(),c.getStamina(),c.getStamina()-(c.getAttackPower()-c.getDefense()/2)*1.1);
        //set체력으로 실제로 감소도 시켜주기
        c.setStamina(c.getStamina()-(c.getAttackPower()-c.getDefense()/2)*1.8);
        //현재 마나 40 감소
        setMP(getMP()-40);
    }

    @Override
    public void appearedPrintInfo() {
        System.out.println("시스템 : 힐러가 등장했습니다.");
        System.out.println("아파하지마 힐 해줄게 힐!");
    }

    @Override
    public void run() {
        System.out.println(getCharacterName()+"(이)가 도망을 시도했다!");
        //0 -> 도망 실패, 1 -> 도망 성공
        if(Math.random()<0.5){ //랜덤으로 0~1까지의 모든 실수를 받아옴. 50퍼센트 확률
            System.out.println("도망에 성공했습니다!");
            LineageFunc.getOut();
        }
        System.out.println("도망에 실패했습니다..");
        System.out.println("의기소침 해져 공격력 3을 잃습니다.");
        //공격력 3 영구적으로 잃기
        setAttackPower(getAttackPower()-3);
    }

    @Override
    public void mockery(Character c) {
        System.out.println(getCharacterName()+" : 메롱메롱~~@$#=^오^=");
        System.out.printf("상대 체력이 %.1f 내려갔습니다.\n",8.0);
        c.setStamina(getStamina()-8.0);
        System.out.printf("%s님의 현재 체력 : %.1f\n",c.getCharacterName(),c.getStamina());
        System.out.printf("내 마나가 %d 회복됩니다.\n",20);
        setMP(getMP()+20);
        System.out.println("현재 마나 : "+ getMP());
    }
}


