package code.lab5.etcClass;

import code.lab5.zombieList.armoredZombie;
import code.lab5.zombieList.walkingZombie;
import code.lab5.zombieList.zombie;

public class plant {
    public void attack(destroyable destroyed) {
        destroyed.destroyed();
    }
}
