package code.lab5.zombieList;

import code.lab5.etcClass.Armor;

public class armoredZombie extends zombie {
    private Armor armor;

    public armoredZombie(int health,Armor armor) {
        super(health);
        this.armor = armor;
    }

    @Override
    public void destroyed() {
        if (armor.getStrength() > 0) {
            armor.destroyed();
        } else if (armor.getStrength() <= 0) {
            health -= health * 0.02;
            getZombieInfo();
        }
    }
    
    


    public void getZombieInfo() {
        System.out.println("Armored Zombie");
        System.out.println("Health: " + getHealth());
        System.out.println("Armor strength: " + armor.getStrength());
    }

    public Armor getArmor() {
        return armor;
    }
}
