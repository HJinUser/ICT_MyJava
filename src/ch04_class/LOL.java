package ch04_class;

public class LOL {
    // 캐릭터 이름, 공격력, 현재 체력, 방어력, 기본공격, 스킬공격, 보유아이템(이건 천천히)
    // 아이템 이름, 가격, 공증가, 체증가, 방증가
    private String name; //캐릭터 이름
    private int ad; //공격력
    private int heal; //현재 체력
    private int def; //방어력
    private LOLItem lolItem;

    //기본 공격
    void Nomal_Atack(LOL enemy) { //이름 불러오면 그걸 또 그 구조체를 불러서 거기에 때리기
        enemy.heal -= ad -enemy.def / 2; //방어력의 절반만큼 데미지 깎기. 적 체력에서 깍인 공격력만큼 줄이기
        System.out.println(name + "가 " + enemy.name + "를(을) 공격했습니다.");
        System.out.println(ad -enemy.def / 2 + "만큼의 공격이 들어갔습니다!");
        System.out.println(enemy.name + "의 체력이 " + enemy.heal + " 남았습니다.");
        System.out.println();
    }

    //스킬 공격
    void Cri_Atack(LOL enemy) {
        enemy.heal -= ad * 2 - enemy.def / 2; //크리공격은 기본공격력에서 2배로 공격
        System.out.println(name + "가 " + enemy.name + "를 크리티컬로 공격했습니다.");
        System.out.println(ad * 2 -enemy.def / 2 + "만큼의 공격이 들어갔습니다!");
        System.out.println(enemy.name + "의 체력이 " + enemy.heal + " 남았습니다.");
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String _name) {
        name=_name;
    }

    public int getAd() {
        return ad;
    }

    public void setAd (int _ad){
        ad=_ad;
    }
    public int getHeal() {
        return heal;
    }

    public void setHeal (int _heal){
        heal=_heal;
    }
    public int getDef() {
        return def;
    }
    public void setDef (int _def){
        def=_def;
    }

    //-------------------------------------------------------------------------------------
    //아이템을 만들어보자
    // 아이템 이름, 가격, 공증가, 체증가, 방증가


    void buy_item(LOLItem _lolItem){
        //ad += lolItem.getAd_up();
        this.lolItem=_lolItem;
    }

}
