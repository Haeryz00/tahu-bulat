package code.lab5.etcClass;

import code.lab5.zombieList.walkingZombie;
import code.lab5.zombieList.zombie;

public class plant {
    public void attack(destroyable d){
        d.destroyed();

        if (d instanceof zombie) {
        walkingZombie walkzomb = (walkingZombie) d;
        walkzomb.getzombieinfo();
        // System.out.println("Zombie health");
        }
    }
}
