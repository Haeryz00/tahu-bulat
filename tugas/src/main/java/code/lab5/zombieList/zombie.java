package code.lab5.zombieList;

import code.lab5.etcClass.destroyable;

public class zombie implements destroyable{
    protected int health;

    public zombie(int health) {
        this.health = health;
    }

    @Override
    public void destroyed() {
        health -= (health > 0) ? health * 0.04 : health * 0.02;
        System.out.println("Health: " + health);
    }

    public int getHealth() {
        return health;
    }
}
