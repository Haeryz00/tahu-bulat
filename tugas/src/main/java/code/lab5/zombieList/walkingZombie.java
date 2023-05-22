package code.lab5.zombieList;

public class walkingZombie extends zombie{
    public walkingZombie(int health) {
        super(health);
    }

    @Override
    public void destroyed() {
        if (health > 0) {
            health -= health * 0.04;
        }
        getZombieInfo();
    }

    public void getZombieInfo() {
        System.out.println("Walker Zombie");
        System.out.println("Health: " + health);
    }
}
