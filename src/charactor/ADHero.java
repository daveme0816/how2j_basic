package charactor;

import property.Item;
import property.LifePotion;

public class ADHero extends Hero implements AD,Mortal{
    int moveSpeed=400; //移动速度
    public ADHero(String name) {
        super(name);
        System.out.println("AD Hero的构造方法");
    }

    public ADHero(){

        System.out.println("AD Hero的构造方法");
    }

    public void attack(Hero... heros) {
        for (int i = 0; i < heros.length; i++) {
            System.out.println(name + " 攻击了 " + heros[i].name);

        }
    }
    public int getMoveSpeed(){
        return this.moveSpeed;
    }

    public int getMoveSpeed2(){
        return super.moveSpeed;
    }
    // 重写useItem，并在其中调用父类的userItem方法
    public void useItem(Item i) {
        System.out.println("adhero use item");
        super.useItem(i);
    }

    //隐藏父类的battleWin方法
    public static void battleWin(){
        System.out.println("ad hero battle win");
    }

    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }

    @Override
    public void die() {
        System.out.println("ADHero was died.");
    }

    public static void main(String[] args){
        ADHero h= new ADHero();
        LifePotion lp = new LifePotion();
        h.useItem(lp);
    }
}
