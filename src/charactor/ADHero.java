package charactor;

public class ADHero extends Hero{
    public ADHero(String name) {
        super(name);
    }

    public void attack(Hero... heros) {
        for (int i = 0; i < heros.length; i++) {
            System.out.println(name + " 攻击了 " + heros[i].name);

        }
    }
}
