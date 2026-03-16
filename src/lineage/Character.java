package lineage;

public abstract class Character {
    private final String gender;                        //성별
    private final String characterName;                 //캐릭터명
    private final double defense;                       //방어력
    private double attackPower;                         //공격력
    private double stamina;                             //체력
    private double MP;                                  //마나양


    public Character(String gender, String characterName, double attackPower, double defense, double stamina, double MP) {
        this.gender = gender;
        this.characterName = characterName;
        this.attackPower = attackPower;
        this.defense = defense;
        this.stamina = stamina;
        this.MP = MP;
    }

    public double getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(double attackPower) {
        this.attackPower = attackPower;
    }

    public double getDefense() {
        return defense;
    }

    public String getGender() {
        return gender;
    }

    public double getStamina() {
        return stamina;
    }

    public void setStamina(double stamina) {
        this.stamina = stamina;
    }

    public String getCharacterName() {
        return characterName;
    }

    public double getMP() {return MP;}

    public void setMP(double MP) {this.MP = MP;}

    //등장멘트
    public abstract void appearedPrintInfo();
    //물약사용
    public abstract void usingPotion();
    //공격
    public abstract void attack(Character o);
}
