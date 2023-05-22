package code.lab5.etcClass;

import code.lab5.zombieList.armoredZombie;
import code.lab5.zombieList.walkingZombie;
import code.lab5.zombieList.zombie;

public class plant {
    public void attack(destroyable d) {
        d.destroyed();

        if (d instanceof walkingZombie) {
            walkingZombie walkzomb = (walkingZombie) d;
            walkzomb.getzombieinfo();
            // System.out.println("Zombie health");
        }

        if (d instanceof armoredZombie) {
            armoredZombie armzom = (armoredZombie) d;
            armzom.getzombieinfo();
        }
    }
}
