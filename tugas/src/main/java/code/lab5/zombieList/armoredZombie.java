package code.lab5.zombieList;

import code.lab5.etcClass.Armor;

public class armoredZombie extends zombie {
    public int health;
    public Armor armor;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    

    public void destroyed() {
        System.out.println("Armored Zombie destroyed");
    }
    
    

    public String getZombieInfo() {
        String zombieInfo = "Armored Zombie:\n";
        zombieInfo += "Health: " + health + "\n";
        zombieInfo += "Armor Strength: " + armor.getStrength();
        return zombieInfo;
    }

    public void attack() {
        if (armor.getStrength() > 0) {
            int damageToArmor = (int) (armor.getStrength() * 0.05);
            armor.setStrength(armor.getStrength() - damageToArmor);
        } else {
            int damageToHealth = (int) (health * 0.02);
            health -= damageToHealth;
        }
    }
}
