package code.lab5.zombieList;

import code.lab5.etcClass.destroyable;

public class zombie implements destroyable{
    public int health;


    @Override
    public void destroyed() {
    System.out.println("Zombie telah mati");
}

    public void getzombieinfo() {
        System.out.println("Health: " +health);
    }
}
