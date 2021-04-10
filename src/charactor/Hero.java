package charactor;

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
        System.out.println("一个参数的构造方法");
    }

    public Hero(String name,float hp) {
        this.name = name;
        this.hp = hp;
        System.out.println("两个参数的构造方法");
    }

    public Hero(String name,float hp,float armor,int moveSpeed) {
        this.name = name;
        this.hp = hp;
        this.armor = armor;
        this.moveSpeed = moveSpeed;
        System.out.println("四个参数的构造方法");
    }

    public Hero() {
        System.out.println("NULL的构造方法");
    }

    public void equip(Weapon w) {
        System.out.println("equip Weapon");
    }

    public static void main(String[] args) {
        Hero garen =  new Hero();
        garen.name = "盖伦";

        Hero.copyright = "版权由Riot Games公司所有";

        System.out.println(garen.name);
        System.out.println(copyright);

        Hero teemo =  new Hero();
        teemo.name = "提莫";
        System.out.println(teemo.name);
        System.out.println(copyright);
    }
}
