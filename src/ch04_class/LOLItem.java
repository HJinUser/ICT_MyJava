package ch04_class;
// 아이템 이름, 가격, 공증가, 체증가, 방증가

public class LOLItem {
    private String item_name;
    private int item_price;
    private int ad_up;
    private int hp_up;
    private int def_up;

    public LOLItem(String item_name, int item_price, int hp_up, int ad_up, int def_up){
        this.item_name=item_name;
        this.item_price=item_price;
        this.ad_up=ad_up;
        this.hp_up=hp_up;
        this.def_up=def_up;
    }
    public LOLItem(){};

    public String getItem_name() {
        return item_name;
    }
    public void setItem_name (String _item_name){
        item_name=_item_name;
    }

    public int getAd_up() {
        return ad_up;
    }
    public void setAd_up (int _ad_up){
        ad_up=_ad_up;
    }

    public int getHp_up() {
        return hp_up;
    }
    public void setHp_up (int _hp_up){
        hp_up=_hp_up;
    }

    public int getDef_up() {
        return def_up;
    }
    public void setDef_up (int _def_up){
        def_up=_def_up;
    }

    public int getItem_price() {
        return item_price;
    }
    public void setItem_price (int _item_price){
        item_price=_item_price;
    }

}
