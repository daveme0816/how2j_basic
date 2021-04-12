package charactor;

import property.Item;
import property.Weapon;

public class Hero {
    //属性id是private的，只有Hero自己可以访问
    //子类不能继承
    //其他类也不能访问
    private int id;
    String name;
    float hp;
    float armor;
    int moveSpeed;
    static String copyright;//类属性,静态属性

    public Hero(String name) {
        this.name = name;
        System.out.println("Hero的有一个参数的构造方法 ");
    }

    public Hero(String name, float hp) {
        this.name = name;
        this.hp = hp;
        System.out.println("两个参数的构造方法");
    }

    public Hero(String name, float hp, float armor, int moveSpeed) {
        this.name = name;
        this.hp = hp;
        this.armor = armor;
        this.moveSpeed = moveSpeed;
        System.out.println("四个参数的构造方法");
    }

    public Hero() {
        System.out.println("Hero的构造方法");
    }

    public void kill(Mortal m) {
        System.out.println(m + "was killed!");
        m.die();
    }

    public void equip(Weapon w) {
        System.out.println("equip Weapon");
    }

    public static void battleWin() {
        System.out.println("hero battle win");
    }

    public void useItem(Item i){
        System.out.println("hero use item");
        i.effect();
    }
    public static void main(String[] args) {
        new Hero();
//        AD adi = new ADHero();

//        ADHero ad = new ADHero();
//
//        APHero ap = new APHero();
//
//        // 没有继承关系的类型进行互相转换一定会失败，所以会出现编译错误
//        ad = (ADHero) ap;

//        Hero garen = new Hero();
//        garen.name = "盖伦";
//        Mortal teemo1 = new ADHero("提莫1");
//        Mortal teemo2 = new APHero("提莫2");
//        Mortal teemo3 = new ADAPHero("提莫3");
//
//        garen.kill(teemo1);
//        garen.kill(teemo2);
//        garen.kill(teemo3);

//
//        Hero.copyright = "版权由Riot Games公司所有";
//
//        System.out.println(garen.name);
//        System.out.println(copyright);
//
//        Hero teemo =  new Hero();
//        teemo.name = "提莫";
//        System.out.println(teemo.name);
//        System.out.println(copyright);
        //ADHero ad = new ADHero();
        //Hero h = ad;
        //AD adi = (AD) h;
        //APHero ap = (APHero) adi;

    }
}
