package lineage;

public class Burglar extends Character implements Action {
    //기본 스펙 생각하기
    // 물약 먹기 구현
    // 스킬명도 생각해두고, 어떻게 할건지
    // 인터페이스 구상이 끝나면 받아와서 메소드 완성하기
    // gender : "남"
    // name : "좀도둑"
    // ad : 40
    // block : 10
    // hp : 95
    // mp : 80

    // 물약 갯수
    int mp_potion = 3;

    public Burglar(String gender, String characterName, double attackPower, double defense, double stamina, double MP) {
        super(gender, characterName, attackPower, defense, stamina, MP);
    }

    @Override
    public void appearedPrintInfo() {
        if ("남".equals(super.getGender())) {
            System.out.println("시스템 : 좀도둑이 선택되었습니다.");
            System.out.println("괴도루팡 뺨치는 대도둑이로소이다.");
        } else {
            System.out.println("시스템 : 좀도둑이 선택되었습니다.");
            System.out.println("도망치는데는 넘버원!");
        }
    }

    //기본 공격
    @Override
    public void attack(Character c) {
        System.out.printf("%s님이 %s님을 기본 공격 했습니다.\n",super.getCharacterName(),c.getCharacterName());
        System.out.printf("%s 체력 : %.1f -> %.1f \n",c.getCharacterName(),c.getStamina(),c.getStamina()-(c.getAttackPower()-c.getDefense()/2));
        c.setStamina(c.getStamina()-(c.getAttackPower()-c.getDefense()/2));
    }

    //물약 먹기
    @Override
    public void usingPotion() { //멤버변수 mp_potion으로 비교
        if (mp_potion == 0) { //포션이 0이 되었다면 사용 x
            System.out.println("현재 보유하고 있는 포션이 없습니다");
            return;
        }

        //포션 사용
        System.out.println(super.getCharacterName() + "님이 체력회복 포션을 먹었습니다.");
        //체력 10 회복해주기
        setStamina(getStamina() + 10);
        //멤버변수 mp_potion 하나 줄이기
        mp_potion--;

    }

    @Override
    public void run() { //50퍼센트 확률로 도망 성공 (무승부) or 공격력 감소
        System.out.println(getCharacterName()+"(이)가 도망을 시도했다!");
        //0 -> 도망 실패, 1 -> 도망 성공
         //랜덤으로 0~1까지의 모든 실수를 받아옴. 50퍼센트 확률
        if(Math.random()<0.5){ //랜덤으로 0~1까지의 모든 실수를 받아옴. 50퍼센트 확률
            System.out.println("도망에 성공했습니다!");
            LineageFunc.getOut();
        }

        System.out.println("도망에 실패했습니다..");
        System.out.println("의기소침 해져 공격력 3을 잃습니다.");
        //공격력 3 영구적으로 잃기
        setAttackPower(getAttackPower()-3);
    }

    //메테오~
    @Override
    public void skill(Character c) {
        System.out.println("스킬이 발동됩니다.");
        //현재 소지한 마나가 필요 마나보다 부족할 때 참으로 리턴하기
        if(super.getMP()<20){ //현재 마나 비교
            System.out.println("소지한 마나가 부족합니다. (현재마나 : "+super.getMP()+")");
            return;
        }
        System.out.println(super.getCharacterName()+" : 판타스틱!");
        System.out.println(super.getCharacterName()+"가 판타스틱 기술로 상대의 무기를 훔쳤습니다.");
        //현재 체력에서 감소된 체력 보여주기
        //현재 체력 : 캐릭.get체력
        //감소된 체력 : 현재체력 - 1.8*(공격력 - 방어력/2)
        System.out.printf("%s 체력 : %.1f -> %.1f \n",c.getCharacterName(),c.getStamina(),c.getStamina()-(c.getAttackPower()-c.getDefense()/2)*1.8);
        //set체력으로 실제로 감소도 시켜주기
        c.setStamina(c.getStamina()-(c.getAttackPower()-c.getDefense()/2)*1.3);
        //현재 마나 40 감소
        setMP(getMP()-20);
    }

    @Override
    public void mockery(Character c) {
        System.out.println(getCharacterName()+" : 우쭈쭈~~@$#=^오^=");
        System.out.printf("상대 체력이 %.1f 내려갔습니다.\n",8.0);
        c.setStamina(getStamina()-8.0);
        System.out.printf("%s님의 현재 체력 : %.1f\n",c.getCharacterName(),c.getStamina());
        System.out.printf("내 마나가 %d 회복됩니다.\n",20);
        setMP(getMP()+20);
        System.out.println("현재 마나 : "+ getMP());
    }
}
