package lineage;

public class Musketeer extends Character implements Action {
    int mp_potion = 3;

    public int getMp_potion() {
        return mp_potion;
    }

    public void setMp_potion(int mp_potion) {
        this.mp_potion = mp_potion;
    }

    public Musketeer(String gender, String characterName, double attackPower, double defense, double stamina, double MP) {
        super(gender, characterName, attackPower, defense, stamina, MP);
    }

    @Override
    public void attack(Character c){
        System.out.printf("%s님이 %s님을 기본 공격 했습니다.\n",super.getCharacterName(),c.getCharacterName());
        System.out.printf("%s 체력 : %.1f -> %.1f \n",c.getCharacterName(),c.getStamina(),c.getStamina()-(c.getAttackPower()-c.getDefense()/2));
        c.setStamina(c.getStamina()-(c.getAttackPower()-c.getDefense()/2));
    }

    @Override
    public void usingPotion() {

        if(getMp_potion() == 0){
            System.out.println("물약이 없어서 사용할수가 없습니다.");
            return;
        }

        setMp_potion(getMp_potion() - 1);
        super.setStamina(50);
        System.out.println("체력이 50 증가 했습니다.");
    }


    @Override
    public void skill(Character c) {
        System.out.println("스킬이 발동됩니다.");
        c.setStamina(c.getStamina() - getAttackPower() * 4);
        System.out.println("패스트 드로우를 사용해서 " + c.getCharacterName()+"의 체력이 "+ (getAttackPower() * 4) + "감소했습니다.");
    }

    @Override
    public void appearedPrintInfo() {
        if ("남".equals(super.getGender())) {
            System.out.println("시스템 : 총사가 선택되셨습니다.");
            System.out.println("총사 : 설마 권총일거라고 생각한건 아니겠지?");
        } else {
            System.out.println("시스템 : 총사가 선택되셨습니다.");
            System.out.println("총사 : 총알 한 발로 세상을 평정해주지");
        }
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
        System.out.println(getCharacterName()+" : 이런싸가지 없는놈~~@$#=^오^=");
        System.out.printf("상대 체력이 %.1f 내려갔습니다.\n",8.0);
        c.setStamina(getStamina()-8.0);
        System.out.printf("%s님의 현재 체력 : %.1f\n",c.getCharacterName(),c.getStamina());
        System.out.printf("내 마나가 %d 회복됩니다.\n",20);
        setMP(getMP()+20);
        System.out.println("현재 마나 : "+ getMP());

    }
}
